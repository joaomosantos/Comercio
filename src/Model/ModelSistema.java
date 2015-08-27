package Model;
import Dao.DBAConexao;
import Object.Pessoa;
import java.awt.Color;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.SQLException;
import java.util.regex.*;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ModelSistema {
   static DBAConexao c = new DBAConexao();
   
   public boolean validarUsuarioModel(Pessoa usuario) {
        try {
            c.conectar();
            c.stm = c.conexao.createStatement();
            c.rs = c.stm.executeQuery("SELECT NOME, USUARIO, SENHA, ATIVO FROM TB_USUARIO");
            String senha = Criptografar(usuario.getSenha());
            while (c.rs.next()) {
                if(usuario.getUsuario().equals(c.rs.getString("USUARIO")) && senha.equals(c.rs.getString("SENHA")) && c.rs.getBoolean("ATIVO") == true) {
                    usuario.setNome(c.rs.getString("NOME"));
                    return true;
                }                
            }  
        } catch (Exception e) {
            c.desconectar();
            JOptionPane.showMessageDialog(null, "Erro ao tentar validar usuario\nERRO: " + e.getMessage(), "Banco de Dados", JOptionPane.INFORMATION_MESSAGE);
        }
        c.desconectar();
        return false;
    }
   
   public boolean logoffUsuarioModel() {
       if(c.isConnected()) {
           c.desconectar();
           return true;
       }
       return false;
   }
   
   public String Criptografar(String str) {  
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(str.getBytes(), 0, str.length());
            String senha = new BigInteger(1, m.digest()).toString(16);
            return senha;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Criptografar: " + ex);
            return "";
        }
    }
   
   public void validarCampos(Pessoa acesso, JTextField [] tf) {
        String regex = "[\\w\\._@]";
        Pattern p = Pattern.compile(regex);
        for(int i = 0; i < tf.length; i++) {
            tf[i].setBorder(UIManager.getBorder("TextField.border"));
            if(tf[i].getText().equals("") || tf[i].getText().equals(null)) {
                JOptionPane.showMessageDialog(null, "Não é permitido campo vazio", "Banco de Dados", JOptionPane.INFORMATION_MESSAGE);
                tf[i].setBorder(BorderFactory.createLineBorder(Color.RED));
                return;
            } else { 
                for(int j = 0; j < tf[i].getText().length(); j++) {
                    char c = tf[i].getText().charAt(j);
                    String conversao = Character.toString(c);
                    Matcher m = p.matcher(conversao);
                    if(!m.matches()) {
                        JOptionPane.showMessageDialog(null, "Não é permitido caracter especial", "Banco de Dados", JOptionPane.INFORMATION_MESSAGE);
                        tf[i].setBorder(BorderFactory.createLineBorder(Color.RED));
                        return;
                    }
                }
            }
        }
        this.salvarUsuarioModel(acesso);
   }
   
   public void salvarUsuarioModel(Pessoa acesso) {
        try {
            c.pst = c.conexao.prepareStatement("INSERT INTO TB_USUARIO (NOME, SOBRENOME, EMAIL, USUARIO, SENHA, ATIVO) VALUES (?,?,?,?,?,?)");
            c.pst.setString(1, acesso.getNome());
            c.pst.setString(2, acesso.getSobrenome());
            c.pst.setString(3, acesso.getEmail());
            c.pst.setString(4, acesso.getUsuario());
            String senha = Criptografar(acesso.getSenha());
            c.pst.setString(5, senha);
            c.pst.setBoolean(6, acesso.isAtivo());
            c.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na inserção!\nErro: " + ex.getMessage());
        }
    }
}

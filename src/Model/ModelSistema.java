package Model;
import Dao.DBAConexao;
import Object.Pessoa;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ModelSistema {
   static DBAConexao c = new DBAConexao();
   
   public boolean validarUsuarioModel(Pessoa usuario) {
        try {
            c.conectar();
            c.stm = c.conexao.createStatement();
            c.rs = c.stm.executeQuery("SELECT NOME, USUARIO, SENHA FROM TB_USUARIO");
            while (c.rs.next()) {
                if(usuario.getUsuario().equals(c.rs.getString("USUARIO")) && usuario.getSenha().equals(c.rs.getString("SENHA"))) {
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
   
   public void salvarUsuarioModel(Pessoa acesso) {
        try {
            c.pst = c.conexao.prepareStatement("insert into TB_USUARIO (NOME, SOBRENOME, EMAIL, USUARIO, SENHA, ATIVO) values (?,?,?,?,?,?)");
            c.pst.setString(1, acesso.getNome());
            c.pst.setString(2, acesso.getSobrenome());
            c.pst.setString(3, acesso.getEmail());
            c.pst.setString(4, acesso.getUsuario());
            c.pst.setString(5, acesso.getSenha());
            c.pst.setBoolean(6, acesso.isAtivo());
            c.pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na inserção!\nErro: " + ex.getMessage());
        }
    }
}

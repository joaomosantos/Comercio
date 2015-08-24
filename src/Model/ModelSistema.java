package Model;
import Dao.DBAConexao;
import Object.Pessoa;
import javax.swing.JOptionPane;

public class ModelSistema {
   public boolean validarUsuarioModel(Pessoa usuario) {
        DBAConexao c = new DBAConexao();
        c.conectar();
        try {
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
}

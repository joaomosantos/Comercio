package Controller;
import Model.*;
import Object.Pessoa;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ControllerSistema {
    ModelSistema modelsistema = new ModelSistema();
    
    public boolean validarUsuario(Pessoa usuario) {   
        return modelsistema.validarUsuarioModel(usuario);
    }
    
    public boolean logoffUsuario() {
        return modelsistema.logoffUsuarioModel();
    }
    
    public void salvarUsuario(Pessoa acesso, JTextField [] tf, JLabel [] l) { 
        modelsistema.validarCampos(acesso, tf, l);
    }
}

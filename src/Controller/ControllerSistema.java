package Controller;
import Model.*;
import Object.Pessoa;
import javax.swing.JTextField;

public class ControllerSistema {
    ModelSistema modelsistema = new ModelSistema();
    
    public boolean validarUsuario(Pessoa usuario) {   
        return modelsistema.validarUsuarioModel(usuario);
    }
    
    public boolean logoffUsuario() {
        return modelsistema.logoffUsuarioModel();
    }
    
    public void salvarUsuario(Pessoa acesso, JTextField [] tf) { 
        modelsistema.validarCampos(acesso, tf);
    }
}

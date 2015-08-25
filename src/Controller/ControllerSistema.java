package Controller;
import Model.*;
import Object.Pessoa;

public class ControllerSistema {
    ModelSistema modelsistema = new ModelSistema();
    
    public boolean validarUsuario(Pessoa usuario) {   
        return modelsistema.validarUsuarioModel(usuario);
    }
    
    public boolean logoffUsuario() {
        return modelsistema.logoffUsuarioModel();
    }
}

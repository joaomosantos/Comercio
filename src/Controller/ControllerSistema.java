package Controller;
import Model.ModelSistema;
import Object.Pessoa;

public class ControllerSistema {
    public boolean validarUsuario(Pessoa usuario) {
        ModelSistema modelsistema = new ModelSistema();
        return modelsistema.validarUsuarioModel(usuario);
    }
}

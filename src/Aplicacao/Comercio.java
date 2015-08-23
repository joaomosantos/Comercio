package Aplicacao;
import Dao.dbaConexao;

public class Comercio {

    public static void main(String[] args) {
        dbaConexao conexao = new dbaConexao();
        conexao.conectar();
    }

}

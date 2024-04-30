
package classes;


public class Dados {
    public boolean validarUsuario (String usuario,String senha){
        if(usuario.equals("san1")&& senha.equals("123")) {
            return true;
        }else{
            return false;
        }
    }
}
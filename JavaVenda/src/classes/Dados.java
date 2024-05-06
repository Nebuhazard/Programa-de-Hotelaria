
package classes;

public class Dados {
    private Usuario msUsuarios[]=new Usuario[50];
    private int conUsu = 0;
    
    public Dados (){
        Usuario mUsuario = new Usuario ("san", "san1", "san2", "123", 1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        
    }
    
    public Usuario[]getUsuarios(){
        return msUsuarios;
    }
    
    public boolean validarUsuario (String usuario,String senha){
        boolean aux = false;
        for(int i = 0; i<conUsu; i++){
            if(msUsuarios[i].getIdUsuario().equals(usuario)&& msUsuarios[i].getSenha().equals(senha)){
            return true;
        }
            
        }
        return false;
    }
}
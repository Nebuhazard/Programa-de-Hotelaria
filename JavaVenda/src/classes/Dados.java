
package classes;

public class Dados {
    //configurações do máximo de uduários da lista de usuários
    private int maxUsu = 50;
    private Usuario msUsuarios[]=new Usuario[maxUsu];
    private int conUsu = 0;
    
    //configurações do máximo de produtos da lista de produtos
    private int maxPro = 100;
    private Produto msProdutos[]=new Produto[maxPro];
    private int conPro = 0;
    
    //configurações do máximo de produtos da lista de clientes
    private int maxCli = 100;
    private Cliente msClientes[]=new Cliente[maxCli];
    private int conCli = 0;
    
    //3 usuários adicionados na lista de usuários.
    public Dados (){
        Usuario mUsuario;
        mUsuario = new Usuario ("san1", "san1", "san2", "123", 1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        
        mUsuario = new Usuario ("san2", "san1", "san2", "123", 2);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        
        mUsuario = new Usuario ("san3", "san1", "san2", "123", 1);
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        
        //1 produto adicionado na lista de produtos.
        Produto mProduto;
        mProduto = new Produto ("1", "Arroz", 50, 0, "");
        msProdutos[conPro] = mProduto;
        conPro++;  
        
        mProduto = new Produto ("2", "Feijão", 80, 1, "");
        msProdutos[conPro] = mProduto;
        conPro++; 
        
        mProduto = new Produto ("3", "Milho amarelo", 60, 2, "");
        msProdutos[conPro] = mProduto;
        conPro++; 
        
        
        //1 cliente adicionado na lista de produtos.
        Cliente mCliente;
        
        mCliente = new Cliente ("1", "Sandro", "Torres", "residencial ana facó", "85984220130");
        msClientes[conCli] = mCliente;
        conCli++;
        
        mCliente = new Cliente ("2", "Renan", "zeira", "casa dele","00buraco");
        msClientes[conCli] = mCliente;
        conCli++;  
        
        
         
    }
    
    //variavel pública que simboliza a contagem de usuários
    public int numeroUsuarios(){
        return conUsu;
    }
    
    //variavel pública que simboliza a contagem de produtos
    public int numeroProdutos(){
        return conPro;
    }
    
    //variavel pública que simboliza a ?seleção de usuários?
    public Usuario[]getUsuarios(){
        return msUsuarios;
    }
    
    //variavel pública que simboliza a ?seleção de produtos?
    public Produto[]getProdutos(){
        return msProdutos;
    }
    
    //classe pública para validar usuários, verifica usuário e senha no array criado '[i]' e 
    //retorna se está correto e pode acessar o sistema ou retorna falso e bloqueia o usuário.
    public boolean validarUsuario (String usuario,String senha){
        boolean aux = false;
        for(int i = 0; i<conUsu; i++){
            if(msUsuarios[i].getIdUsuario().equals(usuario)&& msUsuarios[i].getSenha().equals(senha)){
            return true;
        }
            
        }
        return false;
    }
    
    //classe pública para na hora de criar um novo cadastro,
    //verificar se o usuário existe e não criar cadastros repetidos.
    public int posicaoUsuario(String usuario){
        
        for(int i = 0; i<conUsu; i++){
            if(msUsuarios[i].getIdUsuario().equals(usuario)){
            return i;
        }
            
        }
        return -1; //quando retorna -1 significa que usuário ainda não existe
    }
    
    //classe pública para na hora de criar um novo cadastro,
    //verificar se o produto existe e não criar cadastros repetidos.
    public int posicaoProduto(String produto){
        
        for(int i = 0; i<conPro; i++){
            if(msProdutos[i].getIdProduto().equals(produto)){
            return i;
        }
            
        }
        return -1; //quando retorna -1 significa que produto ainda não existe
    }
    
    //Classe criada para adicionar usuários ao banco de dados
    public String adicionarUsuario (Usuario mUsuario){
        if(conUsu == maxUsu){
            return "Limite de usuários atingido";
        }
        msUsuarios[conUsu] = mUsuario;
        conUsu++;
        return "Usuário cadastrado com sucesso";
    }
    
    //Classe criada para adicionar produtos ao banco de dados
    public String adicionarProduto (Produto mProduto){
        if(conPro == maxPro){
            return "Limite de produtos atingido";
        }
        msProdutos[conPro] = mProduto;
        conPro++;
        return "Produto cadastrado com sucesso";
    }
    
    //método para edição de usuários
    public String editarUsuario (Usuario mUsuario, int pos){
        msUsuarios[pos].setNome(mUsuario.getNome());
        msUsuarios[pos].setSnome(mUsuario.getSnome());
        msUsuarios[pos].setSenha(mUsuario.getSenha());
        msUsuarios[pos].setPerfil(mUsuario.getPerfil());
        return "Usuário editado com sucesso";
    }
    
     //método para edição de produtos
    public String editarProduto (Produto mProduto, int pos){
        msProdutos[pos].setDescricao(mProduto.getDescricao());
        msProdutos[pos].setPreco(mProduto.getPreco());
        msProdutos[pos].setImposto(mProduto.getImposto());
        msProdutos[pos].setAnotacao(mProduto.getAnotacao());
        return "Produto editado com sucesso";
    }
    
    //método usado para deletar usuários do banco de dados.
    public String deletarUsuario (int pos){
        for(int i = pos; i < conUsu -1; i++){
            msUsuarios[i] = msUsuarios[i+1];
        }
        conUsu--;
        return "usuário deletado com sucesso";
    }
    
    //método usado para deletar produtos do banco de dados.
    public String deletarProduto (int pos){
        for(int i = pos; i < conPro -1; i++){
            msProdutos[i] = msProdutos[i+1];
        }
        conPro--;
        return "Produto deletado com sucesso";
    }
}
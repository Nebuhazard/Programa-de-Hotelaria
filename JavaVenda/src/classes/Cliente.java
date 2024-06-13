
package classes;
        
public class Cliente {
    //criadas variáveis que vão ser usadas para...
    private String idCliente;
    private String nome;
    private String sNome;
    private String endereço;
    private String telefone;

    //criado método construtor para as variáveis acima
    public Cliente(String idCliente, String nome, String sNome, String endereço, String telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.sNome = sNome;
        this.endereço = endereço;
        this.telefone = telefone;
    }

    //CRIADOS OS GETTERS E SETTERS PARA AS VARIÁVEIS ACIMA
    
    
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getsNome() {
        return sNome;
    }

    public void setsNome(String sNome) {
        this.sNome = sNome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}

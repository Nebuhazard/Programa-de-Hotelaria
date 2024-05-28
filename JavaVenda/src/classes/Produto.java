// classe criada após a criação de verificações dos cadastros de produtos no frmProdutos.

package classes;

public class Produto {
    private String idProduto;
    private String descricao;
    private int preco;
    private int imposto;
    private String anotacao;

    //botão direito,insert code, construtor, criar construtor para nossas variáveis
    public Produto(String idProduto, String descricao, int preco, int imposto, String anotacao) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.preco = preco;
        this.imposto = imposto;
        this.anotacao = anotacao;
    }
    
    //botão direito,insert code, GETTER and SETTER, criar getters e setters para nossas variáveis
    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }
    
    
}

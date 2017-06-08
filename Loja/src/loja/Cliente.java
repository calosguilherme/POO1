
package loja;


public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ListaProduto listP;

    public Cliente(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.listP = new ListaProduto();
    }

    public void produtosComprados() {
        listP.imprimeProduto();
    }

    public void addCliente(Produto p) {
        this.listP.addProduto(p);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereço(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}

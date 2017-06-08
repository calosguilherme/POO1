
package loja;


public class Produto {
    private String nome;
    private String codigo;
    private String marca;
    private String descrição;
    private float preco;

    public Produto(String nome, String codigo, String marca, String descrição, float preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.marca = marca;
        this.descrição = descrição;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
}

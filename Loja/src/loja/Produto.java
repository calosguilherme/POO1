
package loja;


public class Produto {
    private String nome;
    private String codigo;
    private String marca;
    private String descrição;
    private float preço;

    public Produto(String nome, String codigo, String marca, String descrição, float preço) {
        this.nome = nome;
        this.codigo = codigo;
        this.marca = marca;
        this.descrição = descrição;
        this.preço = preço;
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

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }
    
    
    
}

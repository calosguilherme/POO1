
package loja;


public class Produto {
    private String nome;
    private int código;
    private String marca;
    private String descrição;
    private float preço;

    public Produto(String nome, int código, String marca, String descrição, float preço) {
        this.nome = nome;
        this.código = código;
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

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
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

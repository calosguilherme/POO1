
package loja;


public class Cliente {
    private String nome;
    private String Endereço;
    private String telefone;
    private String Email;
    private ListaProduto listP;

    public Cliente(String nome, String Endereço, String telefone, String Email) {
        this.nome = nome;
        this.Endereço = Endereço;
        this.telefone = telefone;
        this.Email = Email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
    
}

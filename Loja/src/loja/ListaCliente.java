
package loja;

import java.util.HashSet;


public class ListaCliente extends HashSet<Cliente>{
    public void addCliente(Cliente c){
        this.add(c);
    }
    public void imprimeDisciplina(){
        for(Cliente c: this){
            System.out.println(c.getNome()+ " " + c.getEmail() + " "
                    + c.getTelefone()+ " " + c.getEndereço());
        }
    }
    public Cliente getCliNome(String nome){ //pegando o cliente pelo nome
        for(Cliente c: this){
            if(c.getNome().equals(nome)){
                return c;
            }
        }
        return null;
    }
}

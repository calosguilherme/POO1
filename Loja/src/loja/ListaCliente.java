
package loja;

import java.util.HashSet;


public class ListaCliente extends HashSet<Cliente>{
    public void addCliente(Cliente c){
        this.add(c);
    }
    public void imprimeCliente(){
        for(Cliente c: this){
            System.out.println(" nome: " + c.getNome()+ " email: " + c.getEmail() + " telefone: "
                    + c.getTelefone()+ " endereco: " + c.getEndereco());
        }
    }
    public Cliente buscaCliente(String nome){ //pegando o cliente pelo nome
        for(Cliente c: this){
            if(c.getNome().equals(nome)){
                return c;
            }
        }
        return null;
    }
    public void excluiCLiente(String nome){
        for(Cliente c: this){
            if(c.getNome().equals(nome)){
                this.remove(c);
            }
        }
     }
}


package loja;

import java.util.ArrayList;


public class ListaProduto extends ArrayList<Produto>{
    public void addProduto(Produto p){
        this.add(p);
    }
    
    public void imprimeProduto(){
        int i,tam;
        tam = this.size(); //pegando o tamanho da lista
        for(i = 0; i < tam; i++)
            System.out.println("codigo:"+this.get(i).getCodigo() + "nome: " 
                    + this.get(i).getNome() + " marca: " 
                    + this.get(i).getMarca() + " descricao: "
                    + this.get(i).getDescrição() + " preco: "
                    + this.get(i).getPreco()); //imprimindo a posicao da lista produto
    }
    
    public Produto buscaProduto(String cod){
        for(Produto p: this){
            if(p.getCodigo().equals(cod)){
                return p;
            }
        }
        return null;
    }
    
     public void excluiProduto(String cod){
        for(Produto p: this){
            if(p.getCodigo().equals(cod)){
                this.remove(p);
            }
        }
     }
    }
    


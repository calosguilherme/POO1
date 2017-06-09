
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
    
    public Produto getCodProduto(String cod){
        for(Produto p: this){
            if(p.getCodigo().equals(cod)){
                return p;
            }
        }
        return null;
    }
    
    public void buscaProduto(String cod){
        
        for(Produto p: this){
            if(p.getCodigo().equals(cod)){
                System.out.println("codigo:"+p.getCodigo()+ "nome: " 
                    + p.getNome() + " marca: " 
                    + p.getMarca() + " descricao: "
                    + p.getDescrição() + " preco: "
                    + p.getPreco()); //imprimindo a posicao da lista produto
            }
        }
    }
    
     public void excluirProduto(String cod){
         
        for(int i = 0; i < this.size(); i++)
        {
            Produto p = this.get(i);
            if(p.getNome().equals("Pedro"))
            {
                this.remove(p);
                break;
           }
        }
     }
    }
    


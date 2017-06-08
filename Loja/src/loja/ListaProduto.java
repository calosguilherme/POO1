
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
            System.out.println(this.get(i).getCodigo() + " " 
                    + this.get(i).getNome() + " " 
                    + this.get(i).getMarca() + " "
                    + this.get(i).getDescrição()); //imprimindo a posicao da lista produto
    }
    
    public Produto getProCod(String cod){
        for(Produto p: this){
            if(p.getCodigo().equals(cod)){
                return p;
            }
        }
        return null;
    }
    
}

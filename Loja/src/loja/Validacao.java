
package loja;

public class Validacao {
    public static void existeCliente(String nome, ListaCliente listc) throws ExClienteInexistente{
        for(Cliente c: listc){
            if(c.getNome().equals(nome)){ //procurando o codigo da disciplina na lista disciplina
                return;
            }
        }
        throw new ExClienteInexistente("Cliente inexistente");
    }
    
    public static void existeProduto(String cod, ListaProduto listp) throws ExProdutoInexistente{
        for(Produto p: listp){
            if(p.getCodigo().equals(cod)){ //procurando o codigo da disciplina na lista disciplina
                return;
            }
        }
        throw new ExProdutoInexistente("Produto inexistente");
    }
}

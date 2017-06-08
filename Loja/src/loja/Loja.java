
package loja;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Loja {


    public static void main(String[] args) {
        Cliente c = null;
        Produto p = null;
        ListaProduto lp = new ListaProduto();
        ListaCliente lc = new ListaCliente();
        String nome,end,tel,email,cod,marca,desc,x,x2;
        float prec;
        x = "";
        x2 ="";
        while (!x.equals("0")){
            /* alimentando o banco com as informações */
            x = JOptionPane.showInputDialog("digite 1 - criar cliente \n"
                    + "digite 2 - criar produto \n"
                    + "digite 3 - gerenciar loja \n" 
                    + "digite 0 - sair \n");
            switch (x) {
                case "1":
                    nome = JOptionPane.showInputDialog("nome do cliente");
                    end = JOptionPane.showInputDialog("endereco");
                    tel = JOptionPane.showInputDialog("telefone");
                    email = JOptionPane.showInputDialog("email");
                    c = new Cliente(nome,end,tel,email);
                    lc.addCliente(c);
                    lc.imprimeCliente();
                    break;
                case "2":
                    nome = JOptionPane.showInputDialog("nome do produto");
                    cod = JOptionPane.showInputDialog("codigo");
                    marca = JOptionPane.showInputDialog("marca");
                    desc = JOptionPane.showInputDialog("descricao");
                    prec = Float.parseFloat(JOptionPane.showInputDialog("preco"));
                    p = new Produto(nome,cod,marca,desc,prec); 
                    lp.addProduto(p);
                    lp.imprimeProduto();
                    break;
                case "3":
                    while(!x2.equals("0")){
                        x2 = JOptionPane.showInputDialog("digite 1 - alocar produto ao cliente \n"
                                + "digite 2 - excluir produto \n"
                                + "digite 3 - buscar produto \n"
                                + "digite 0 - sair");
                        switch(x2){
                            case "1":
                                nome = JOptionPane.showInputDialog("nome do cliente");
                                cod = JOptionPane.showInputDialog("codigo do produto");
                                
                                {
                                    try {
                                        
                                        Validacao.existeCliente(nome, lc);
                                        Validacao.existeProduto(nome, lp);
                                        c.addCliente(lp.buscaProduto(cod));
                                        c.produtosComprados();
                                        
                                    } catch (ExClienteInexistente ex) {
                                        JOptionPane.showMessageDialog(null, "cliente nao existe");
                                    } catch (ExProdutoInexistente ex) {
                                        JOptionPane.showMessageDialog(null, "produto nao existe");
                                    }
                                }
                                break;
                            case "2":
                                break;
                            case "3":
                                break;
                            default:
                                System.out.println("ok");
                        }
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "volte Sempre!");
            }
    
        }
    }
}
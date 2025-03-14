package principal;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemPedido>itensPedido;

    public Pedido(){
        itensPedido = new ArrayList<>();
    }
    public void addItem(Produto produto, int quantidade){
        itensPedido.add(new ItemPedido(produto, quantidade));
    }
    public void imprimir(){
        for (ItemPedido item: itensPedido){
            System.out.println("----------------------------------------");
            System.out.println("Nome: " + item.getProduto().getNome());
            System.out.println("QTD: " + item.getQuantidade());
            System.out.println("----------------------------------------");

        }
    }
}

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz");

        Pedido pedido = new Pedido();

        pedido.addItem(p1,10);

        pedido.imprimir();
    }
}
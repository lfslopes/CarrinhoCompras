import compras.CarrinhoCompras;
import compras.Item;

public class Main {
    public static void main(String[] args) {
        Item bolsa = new Item("Bolsa Prada foleada a ouro", 50000.50, 1);
        Item leiteEmPo = new Item("Leite em pó Ninho, 500g", 29.99, 5);
        Item lapis = new Item("Lápis HB Faber Castell", 3.50, 2);

        CarrinhoCompras carrinho = new CarrinhoCompras(bolsa, leiteEmPo, lapis);


        carrinho.adicionarItem(new Item("Fone KZ-QZ10", 119.90, 1));
        carrinho.adicionarItem("Fone KZ-QZ10", 119.90, 1);

        System.out.println("Valor total do carrinho: R$ " + String.format("%.2f", carrinho.calcularValorTotal()));
        carrinho.getListaItems().forEach(System.out::println);

        System.out.println();
        System.out.println("#####################################################################");
        System.out.println();


        carrinho.removerItem("Fone KZ-QZ10");
        System.out.println("Valor total do carrinho: R$ " + String.format("%.2f", carrinho.calcularValorTotal()));
        carrinho.getListaItems().forEach(System.out::println);
    }
}

package compras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> listaItems = new ArrayList<>();

    public CarrinhoCompras() {}
    public CarrinhoCompras(List<Item> listaItems) {
        this.listaItems = listaItems;
    }
    public CarrinhoCompras(Item... items) {
        this.listaItems.addAll(Arrays.asList(items));
    }
    public void adicionarItem(Item item) {
        listaItems.add(item);
    }
    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItems.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        if (listaItems.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }
        int index = 0;
        while (index < listaItems.size()) {
            if (listaItems.get(index).getNome().equalsIgnoreCase(nome))
                listaItems.remove(index);
            else
                index++;
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : listaItems) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }
    public void ExibirItem() {
        this.listaItems.forEach(System.out::println);
    }
    public List<Item> getListaItems() {
        return Collections.unmodifiableList(listaItems);
    }
}

package list.operacaoes_basicas.exercicio_2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //atritubutos
    private List<Item> itemList;

    public CarrinhoDeCompras(){this.itemList=new ArrayList<>();
    }

    public CarrinhoDeCompras(String nome, double preco, int quantidade) {
    }

    //metodos
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item>itensParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome));
            itensParaRemover.add(i);

            itemList.removeAll(itensParaRemover);
        }
    }

    public double calcularValorTotal(){
        double valorTotal=0;
        for (Item i : itemList){
            valorTotal += i.getPreco() * i.getQuantidade();
            System.out.println(valorTotal);
        }
        return valorTotal;

    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("batata", 14.5, 2);
        carrinhoDeCompras.adicionarItem("feijão", 9.99, 1);

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();

        carrinhoDeCompras.removerItem("batata");
        carrinhoDeCompras.exibirItens();

    }
}

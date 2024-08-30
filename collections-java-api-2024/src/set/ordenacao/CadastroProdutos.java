package set.ordenacao;

import java.util.*;

public class CadastroProdutos {
    //atributo
    private Set<Produto> produtoSet;

    //construtor

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    //metodos
    public void adicionarProduto(String nome, long cod, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
            produtoSet.addAll(produtoSet);
            return produtosPorPreco;
            }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto("Produto 5", 1L, 5, 15);
        cadastroProdutos.adicionarProduto("Produto 0", 2L, 10, 20);
        cadastroProdutos.adicionarProduto("Produto 3", 1L, 2, 10);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}


package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numero;
    private List<Produto> produtos;

    public Pedido(int numero) {
        this.numero = numero;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public int getNumero() {
        return numero;
    }
}

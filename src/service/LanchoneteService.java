package service;

import model.Produto;
import model.Pedido;

import java.util.*;

public class LanchoneteService {

    // Localizar produtos pelo código
    private Map<Integer, Produto> cardapio = new HashMap<>();

    // Manter pedidos na ordem de chegada
    private Queue<Pedido> pedidos = new LinkedList<>();

    // Impedir códigos promocionais duplicados
    private Set<String> codigosPromocionais = new HashSet<>();

    // Organizar vendas por dia e produto
    private Map<String, Map<String, Integer>> vendas =
            new HashMap<>();


    public LanchoneteService() {

        cadastrarProdutos();

        inicializarDias();
    }


    private void cadastrarProdutos() {

        cardapio.put(1,
                new Produto(1, "Café", 5.00));

        cardapio.put(2,
                new Produto(2, "Suco", 8.50));

        cardapio.put(3,
                new Produto(3, "Bolo", 7.00));

        cardapio.put(4,
                new Produto(4, "Sanduíche", 15.00));

        cardapio.put(5,
                new Produto(5, "Salada", 12.00));
    }


    private void inicializarDias() {

        String[] dias = {
                "Segunda",
                "Terça",
                "Quarta",
                "Quinta",
                "Sexta",
                "Sábado",
                "Domingo"
        };

        for (String dia : dias) {

            Map<String, Integer> produtos =
                    new HashMap<>();

            produtos.put("Café", 0);
            produtos.put("Suco", 0);
            produtos.put("Bolo", 0);
            produtos.put("Sanduíche", 0);
            produtos.put("Salada", 0);

            vendas.put(dia, produtos);
        }
    }


    public Produto buscarProduto(int codigo) {

        return cardapio.get(codigo);
    }


    public void adicionarPedido(Pedido pedido) {

        pedidos.add(pedido);
    }


    public boolean adicionarCodigoPromocional(String codigo) {

        return codigosPromocionais.add(codigo);
    }


    public void registrarVenda(
            String dia,
            String produto,
            int quantidade) {

        Map<String, Integer> vendasDoDia =
                vendas.get(dia);

        int quantidadeAtual =
                vendasDoDia.get(produto);

        vendasDoDia.put(
                produto,
                quantidadeAtual + quantidade
        );
    }


    public int calcularTotalProduto(String produto) {

        int total = 0;

        for (Map<String, Integer> dia :
                vendas.values()) {

            total += dia.get(produto);
        }

        return total;
    }
}

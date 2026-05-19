package loja;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {

        produtos.add(produto);

        System.out.println(produto.getNome() + " adicionado ao carrinho.");
    }

    public void listarCarrinho() {

        double total = 0;

        System.out.println("===== CARRINHO =====");

        for(Produto produto : produtos) {

            System.out.println(
                    produto.getNome() +
                            " - R$" +
                            produto.getPrecoBase()
            );

            total += produto.getPrecoBase();
        }

        System.out.println("Total: R$" + total);
        System.out.println();
    }
}
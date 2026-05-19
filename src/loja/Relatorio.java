package loja;

import java.util.ArrayList;

public class Relatorio {

    public void gerarRelatorio(ArrayList<Compra> compras) {

        System.out.println("===== RELATÓRIO DE COMPRAS =====");

        double total = 0;

        for(Compra compra : compras) {

            System.out.println("Cliente: " + compra.getCliente().getNome());
            System.out.println("Produto: " + compra.getProduto().getNome());
            System.out.println("Valor: R$ " + compra.getProduto().getPrecoBase());
            System.out.println("-----------------------------");

            total += compra.getProduto().getPrecoBase();
        }

        System.out.println("Total vendido: R$ " + total);
        System.out.println();
    }
}
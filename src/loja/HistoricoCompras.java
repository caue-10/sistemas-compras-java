package loja;

import java.util.ArrayList;

public class HistoricoCompras {

    private ArrayList<Compra> compras = new ArrayList<>();

    public void adicionarCompra(Compra compra) {
        compras.add(compra);
    }

    public void mostrarHistorico() {

        System.out.println("===== HISTÓRICO =====");

        for(Compra compra : compras) {

            System.out.println(
                    compra.getCliente().getNome() +
                            " comprou " +
                            compra.getProduto().getNome()
            );
        }

        System.out.println();
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }
}
package loja;

public class PagamentoPix extends ProcessadorPagamento {

    @Override
    public boolean processarPagamento(double valor) {

        System.out.println("Pagamento via PIX aprovado.");

        return true;
    }
}
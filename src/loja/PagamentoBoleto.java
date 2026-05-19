package loja;

public class PagamentoBoleto extends ProcessadorPagamento {

    @Override
    public boolean processarPagamento(double valor) {

        System.out.println("Pagamento via boleto aprovado.");

        return true;
    }
}
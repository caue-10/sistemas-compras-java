package loja;

public class ProdutoVestuario extends Produto {

    private String tamanho;

    public ProdutoVestuario(
            String codigo,
            double precoBase,
            String nome,
            String tamanho
    ) {

        super(codigo, precoBase, nome);

        this.tamanho = tamanho;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.10;
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("===== PRODUTO VESTUÁRIO =====");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço Base: R$ " + getPrecoBase());
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço Final: R$ " + calcularPrecoFinal());
        System.out.println();
    }
}
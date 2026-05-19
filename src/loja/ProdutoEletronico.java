package loja;

public class ProdutoEletronico extends Produto {

    private String marca;

    public ProdutoEletronico(
            String codigo,
            double precoBase,
            String nome,
            String marca
    ) {

        super(codigo, precoBase, nome);

        this.marca = marca;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.15;
    }

    @Override
    public void exibirDetalhes() {

        System.out.println("===== PRODUTO ELETRÔNICO =====");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço Base: R$ " + getPrecoBase());
        System.out.println("Marca: " + marca);
        System.out.println("Preço Final: R$ " + calcularPrecoFinal());
        System.out.println();
    }
}
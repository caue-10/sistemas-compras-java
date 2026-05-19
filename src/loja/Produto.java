package loja;

public abstract class Produto {

    private String codigo;
    private double precoBase;
    private String nome;

    public Produto(String codigo, double precoBase, String nome) {
        this.codigo = codigo;
        this.precoBase = precoBase;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularPrecoFinal();

    public abstract void exibirDetalhes();
}
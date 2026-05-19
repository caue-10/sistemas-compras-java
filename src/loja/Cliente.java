package loja;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private double saldo = 5000.00;

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void exibirDadosCliente() {

        System.out.println("===== CLIENTE =====");

        System.out.println("Nome: " + nome);

        System.out.println("CPF: " + cpf);

        System.out.println("Telefone: " + telefone);

        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
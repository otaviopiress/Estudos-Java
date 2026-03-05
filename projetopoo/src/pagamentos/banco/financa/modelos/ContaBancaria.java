package pagamentos.banco.contabancaria.modelos;

public class ContaBancaria {
    private String nome;
    private String cargo = "Engenheiro de Software";
    private double salario = 2300;
    private double contasFixas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void contas(double conta) {
        contasFixas += conta;
    }

    public void exibeContaBancaria() {
        System.out.println(nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Seu salário é: " + salario);
        System.out.println("Suas contas fixas são: " + contasFixas);
    }

    public void setContasFixas(double contasFixas) {
        this.contasFixas = contasFixas;
    }

    public double getSaldo(){
        return salario - contasFixas;
    }
}


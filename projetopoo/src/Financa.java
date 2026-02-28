public class Financa {
    String nome;
    String cargo;
    double salario;
    double contasFixas;

    void contas(double conta) {
        contasFixas += conta;
    }

    void exibeFinanca() {
        System.out.println(nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Seu salário é: " + salario);
        System.out.println("Suas contas fixas são: " + contasFixas);
        System.out.println("Você pagou suas contas e sobrou: " + contasPagas());
    }

    double contasPagas(){
        return salario - contasFixas;
    }
}


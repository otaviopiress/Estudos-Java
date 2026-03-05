import pagamentos.banco.conta.modelos.Conta;

import java.util.Scanner;

public class Tela {
    public static void main(String[] args) {
            Conta conta1 = new Conta();
        Scanner titular = new Scanner(System.in);
        System.out.println("Digite o nome do titular da conta: ");
        String nomeTitular = titular.nextLine();
        conta1.setTitular(nomeTitular);
        System.out.println("Nome do titular da conta: " + conta1.setTitular(nomeTitular));

        Scanner deposito = new Scanner(System.in);
        System.out.println("Digite o valor que você quer depositar: ");
        double depositoDinheiro = titular.nextDouble();
        conta1.setDeposito(depositoDinheiro);
        System.out.println("Saldo atual: " + conta1.getSaldo());

        Scanner saque = new Scanner(System.in);
        System.out.println("Digite o valor que você quer sacar: ");
        double saqueDinheiro = titular.nextDouble();
        conta1.setSaque(saqueDinheiro);
        System.out.println("Saldo atual é: " + conta1.getSaque());
    }
}

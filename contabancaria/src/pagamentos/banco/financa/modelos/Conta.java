package pagamentos.banco.conta.modelos;

public class Conta {
    private String titular;
    private double deposito;
    private double saque;
    private double salario = 1804;

    public String setTitular(String nomeTitular) {
        return titular = nomeTitular;
    }

    public double setDeposito(double depositoDinheiro) {
        return deposito = depositoDinheiro;
    }

    public double getSaldo() {
        return salario + deposito;
    }

    public double setSaque(double saqueDinheiro) {
        return saque = saqueDinheiro;
    }

    public double getSaque() {
        if (getSaldo() >= saque) {
            return getSaldo() - saque;
        } else {
            System.out.println("Você não tem saldo suficiente!");
            return getSaldo();
        }
    }
}

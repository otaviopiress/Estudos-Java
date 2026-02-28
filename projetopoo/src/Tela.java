public class Tela {
    public static void main(String[] args) {
        Financa financa1 = new Financa();

        financa1.nome = "Otávio";
        financa1.cargo = "Engenheiro de Software";
        financa1.salario = 6440.40;
        financa1.contas(1550);
        financa1.contas(1570);
        financa1.exibeFinanca();
        financa1.contasPagas();
    }
}

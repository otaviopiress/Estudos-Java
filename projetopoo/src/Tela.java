import pagamentos.banco.financa.modelos.Financa;

public class Tela {
    public static void main(String[] args) {
            Financa financa1 = new Financa();

        financa1.setNome("Otávio");
        //financa1.cargo = "Engenheiro de Software"; Este atributo também foi declarado como private.
        //financa1.salario = 6440.40; Este atributo foi declarado como private então, só pode ser
        //acessado na própria classe em que foi declarado.
        financa1.contas(1550);
        financa1.contas(1570);
        financa1.exibeFinanca();
        financa1.contasPagas();
    }
}

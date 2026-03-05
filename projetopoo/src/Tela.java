import pagamentos.banco.contabancaria.modelos.ContaBancaria;

public class Tela {
    public static void main(String[] args) {
            ContaBancaria contabancaria1 = new ContaBancaria();

        contabancaria1.setNome("Otávio");
        //contabancaria1.cargo = "Engenheiro de Software"; Este atributo também foi declarado como private.
        //contabancaria1.salario = 6440.40; Este atributo foi declarado como private então, só pode ser
        //acessado na própria classe em que foi declarado.
        contabancaria1.contas(1550);
        contabancaria1.contas(1570);
        contabancaria1.exibeContaBancaria();
        System.out.println(contabancaria1.getSaldo());
    }
}

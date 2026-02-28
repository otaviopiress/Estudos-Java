public class Carro {
    String modelo;
    String cor;
    int anoFabricacao;
    int anoAtual = 2026;

    void fichaTecnica(){
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("E ele é da cor: " + cor);
        System.out.println("Foi lançada em: " + anoFabricacao);
        System.out.println("E tem: " + idadeCarro() + "     anos");

    }

    double idadeCarro(){
        return anoAtual - anoFabricacao;
    }
}

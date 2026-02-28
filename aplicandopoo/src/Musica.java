public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes = 0;

    void fichaTecnica(){
        System.out.println("O nome musica é: " + titulo);
        System.out.println("Do artista: " + artista);
        System.out.println("Foi lançada em: " + anoLancamento);
        System.out.println("A média das avaliações é: " + mediaAvaliacao());
        System.out.println("O número de avaliações foi: " + numAvaliacoes);
    }

    void avaliacoes(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacao(){
        return avaliacao / numAvaliacoes;
    }
}

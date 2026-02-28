import java.util.Scanner;
public class Perfil {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = teclado.nextLine();
        System.out.println("Olá, " + nome);
        System.out.println("Tudo bem?");

    }
}
import java.util.Scanner;
public class Estudos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite suas anotações:");
        String notion = teclado.nextLine();
        System.out.println("Essas são todas as suas anotações: " + notion);
    }
}

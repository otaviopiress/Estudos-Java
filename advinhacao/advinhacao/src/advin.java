import java.util.Scanner;
import java.util.Random; //import para poder usar random numbers
public class advin {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int randomNumber = new Random().nextInt(0,100); //determina de quanto a quanto sera gerado o número
            int cont = 1;
            int number = 0;

            while (cont <= 5) {
                System.out.print("Insira um número entre 0 e 100: ");
                number= scanner.nextInt();
                cont++;

                if (number == randomNumber) {
                    System.out.println("Parabéns! ");
                    break;
                } else if (number < randomNumber) {
                    System.out.println("Digite um número maior. ");
                } else {
                    System.out.println("Digite um número menor. ");
                }
            }

            if (cont == 6 && number != randomNumber) {
                System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + randomNumber);
            }
        }
}
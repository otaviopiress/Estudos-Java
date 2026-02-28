import java.util.Scanner;


public class solution {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int inputN = scanner.nextInt();

            if ((inputN % 2) != 0)  {
                System.out.println("Weird ");
        }   else if ((inputN % 2 == 0) && (inputN >= 2 && inputN <= 5)){
                System.out.println("Not Weird");
}           else if ((inputN % 2 == 0) && (inputN >= 6 && inputN <= 20)){
                System.out.println("Weird");
}           else if ((inputN % 2 == 0) && (inputN >= 20)){
                System.out.println("Not Weird");
            }   else{
                System.out.println("Input a valid value!");
            }
}
}
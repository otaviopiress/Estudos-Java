import java.util.Scanner;
public class Conversor {

    public static void main(String[] args){
    Scanner temperatura = new Scanner(System.in);
    System.out.println("Insira a temperatura em graus Celsius: ");
    double tempCelsius = temperatura.nextDouble();
    double tempFahrenheit = (tempCelsius * 1.8) + 32;
    double tempFahreinheitInt = (int) tempFahrenheit;
    System.out.println(tempCelsius + " Celsius em Fahrenheit com casas decimais é:" + tempFahrenheit +
                    "\nA temperatura inteira em Fahreinheit é: " + tempFahreinheitInt);
    }
}






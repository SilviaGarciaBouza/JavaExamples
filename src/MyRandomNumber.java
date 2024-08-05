import java.util.Random;
import java.util.Scanner;

public class MyRandomNumber {
    public static void main(String[] args) {
        //Genera un nº aleatorio entre 0-9
        var myRandom = new Random();

        var randoNumber09 = myRandom.nextInt(10); //no incluye el nº(en este caso elb10)
        System.out.println("randoNumber09 = " + randoNumber09);

        //Genera un nº aleatorio entre 1-10
        var randomNumber110 = myRandom.nextInt(10) + 1;
        System.out.println("randomNumber110 = " + randomNumber110);

        //Ejemplo predicción dado
        var myConsole = new Scanner(System.in);
        var random16 = new Random();


        System.out.println();
        System.out.print("Write a number between 1 and 6: ");
        var number16 = Integer.parseInt(myConsole.nextLine());
        System.out.println();
        System.out.print("Random number between 1 and 6: ");
        var myRandom16 = random16.nextInt(6) + 1;
        System.out.print(myRandom16);
    }
}

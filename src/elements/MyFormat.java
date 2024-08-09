package elements;

import java.util.Random;
import java.util.Scanner;

public class MyFormat {
    public static void main(String[] args) {
        var name = "Silvia";
        var age = 36;
        var pay = 304.25;

        //String.format: %s string, %d enteros, %f fracción( %.2f 2 decimales)
        var message = String.format("name: %s, age: %d, pay: %f", name, age, pay);
        System.out.println(message);

        //printf
        System.out.printf("name: %s, age: %d, pay: %.2f", name, age,pay);

        //format text block  /n pq sino empieza en la línea anterior
        var messageblock = """
                \n 
                name: %s
                \tage: %d
                \tpay: %.2f
                """.formatted(name, age, pay);
        System.out.println(messageblock);


        //format text block con printf
        System.out.printf("""
                \n 
                name: %s
                \tage: %d
                \tpay: %.2f
                """, name, age, pay);

        //Ejercicio: construcción de id de usuario:
        System.out.println();
        var exampleScanner = new Scanner(System.in);
        System.out.print("Write your name: ");
        var yourName = exampleScanner.nextLine();
        System.out.print("Writte your lastname: ");
        var yourLastName = exampleScanner.nextLine();
        System.out.print("Write your born year: ");
       // var yourBornYear = Integer.parseInt(exampleScanner.nextLine());
        var yourBornYear = exampleScanner.nextLine();

        var randomNumber = new Random();
        var yourRandomNumber = randomNumber.nextInt(9999)+1;
        var yourStringRandom = String.format("%04d", yourRandomNumber);//"%04d" por lo menos 4 nº y si no hay completa con 0s a la izda

        var yourId = yourName.trim().toUpperCase().substring(0,2) + yourLastName.trim().toUpperCase().substring(0,2) + yourBornYear.trim().substring(2) + yourStringRandom;

        System.out.println();
        System.out.printf("""
        \nHello %s,
        \tyour new ID is:
        \t%s
        \tCongratulations!"""
, yourName,yourId);
    }
}

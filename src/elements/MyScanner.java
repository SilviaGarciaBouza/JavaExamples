package elements;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args){
        //Introducir valores desde consola: String
        var consola = new Scanner(System.in);//in imput, q toma info de la entrada stándar d datos
        System.out.println("name: ");//q se espera: introduce línea de texto..
        var name = consola.nextLine();//lo q el usuario escribe. nextline lee la línea entera(q es lo q escribio el usuario)
        System.out.println("name = " + name);// lo q scribe luego la consola

        //INt, Double, Float, Boolean
        var consola2 = new Scanner(System.in);
        System.out.println("Write your age: ");
        var age = consola2.nextInt();//Es un entero: nextInt
        System.out.println("age = " + age);

        System.out.println("Write your height: ");
        var height = consola2.nextDouble();//Double
        System.out.println("height = " + height);

        //NextLine antes poner tb el salto de linea para q no lea tod0.
         consola2.nextLine();//antes de nextInt/Double/float/boolean y antes de leer un linea completa
        System.out.print("Write your favourite colour: ");
        var colour = consola2.nextLine();
        System.out.println("colour = " + colour);

        //COnversión de datos: así no hay q poner el consola2.nextLine()
        System.out.println("Write a integer number");
        var intString = consola2.nextLine();//devuelve una string
        var myInt = Integer.parseInt(intString);//convierte el string en float
        System.out.println("myInt = " + myInt);
        //Conversión de dato: flotante: lo pongo reducido, tb se puede hacer como e anterior
        System.out.println("Write a float: ");
        var myFloat = Float.parseFloat(consola2.nextLine());
        System.out.println("myFloat = " + myFloat);
        //Double.parseDouble
        // Boolean.parseBoolean


        //Ejemplo: Recetario de cocina
        var consola3 = new Scanner(System.in);
        System.out.print("Ingresa el nombre: ");
        var recipyName = consola3.nextLine();

        System.out.print("Ingresa los ingredientes: ");
        var ingredients = consola3.nextLine();

        System.out.print("Tiempo de preparación en minutos: ");
        var timeRecipy = Integer.parseInt(consola3.nextLine());

        System.out.print("¿Es fácil? Ingresa true o false: ");
        var easyRecipy = Boolean.parseBoolean(consola3.nextLine());

        System.out.println("***Recipy***");
        System.out.println();
        System.out.println("\t recipyName = " + recipyName);
        System.out.println("\t ingredients = " + ingredients.replace(" ", ","));
        System.out.println("\t timeRecipy = " + timeRecipy + "minutos");
        System.out.println("\t easyRecipy = " + easyRecipy);



    }
}

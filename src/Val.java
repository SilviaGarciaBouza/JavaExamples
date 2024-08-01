import java.sql.SQLOutput;

public class Val {
    public static void main(String[] args){
        //variables


//value devault 0
        byte byteTipe = 127;
        short shortType = 3200;
        int intType = 2147483647;
        long longType =999999L;//L o l sino es int
//value default 0.0
        double doubleType = 1.1315D;//D o d es opcional
        float floatType = 23F;//F o f sino es double
//value default '\u0000'
        char charType = 'r';
//value default false
        boolean booleanType = true;
//value default null
        String stringType = null;
        String stringName2 = "Hello World";

//var se tiene que inicializar (se inicializa al declararse) para saber su tipo(tiene q pode inferirse, no vale poner = null.), en este caso int. No se puede cambiar el tipo después
//var es una val local, siempre dentro de un método
        var varType = 1;

//malas practicas
        // int number-age = 7;  no poner - _ poner numberAge, isWedding hasMoney, tampoco IsMoney
//soutv imprime nombre de la variable y valor en la consola
        System.out.println("stringName2 = " + stringName2);
//sout imprime el valor en laconsola
        System.out.println();
//imprimir una línea en blanco
        System.out.println();

//+ une dos cadenas pero no en la misma pq no se puede modificar. Hay q hacer una tercera. Pon " " entre una y otra si quieres un espacio.
        String name = "Silvia";
        String lastname = "García";
        String allName = name + " " + lastname;
        System.out.println(allName);

// constantes en metodos necesitan un valor al inicializar. Van mayusculas separadas de _ . no se puede modificar el valor.
//Ya hay algunas constantes definidas como Math.PI
        final var WEEK_DAYS = 7;
        final String WEEK_DAY_ONE = "Monday";
        final var MY_PI = 3.1416;
        System.out.println(MY_PI + Math.PI);

//Cadenas

        int age = 36;
        var nameDogHouse = "Casitas";
        nameDogHouse = "dogitas";
        System.out.println(nameDogHouse);
        double weight = 50.1;
        char gender = 'F';
        boolean hungry = true;
        int money;
        money = 2;
        var withHouse = 'W';
        float heigh = 1.75F;
        byte byteTipe1 = 127; //127 es lo max oara byte ya no puede 128
        //soutv imprime nombre de la variable y valor
        System.out.println("byteTipe = " + byteTipe1);

        //name es una clase y Silvia es un objeto. LAs string son clases
        String myName= "Silvia";

        System.out.println(age);
        age = 37;
        System.out.println(age);
        System.out.println(name);

        String nameProduct = "book";
        System.out.println("nameProduct = " + nameProduct);
        int prizeProduct = 5;
        System.out.println("prizeProduct = " + prizeProduct);
        int cuantityProduct = 3;
        System.out.println("cuantityProduct = " + cuantityProduct);
        boolean isAvaliable = true;
        System.out.println("isAvaliable = " + isAvaliable);
        nameProduct = "pencil";
        System.out.println("nameProduct = " + nameProduct);
        prizeProduct = 2;
        System.out.println("prizeProduct = " + prizeProduct);
        cuantityProduct = 8;
        System.out.println("cuantityProduct = " + cuantityProduct);
        isAvaliable = false;
        System.out.println("isAvaliable = " + isAvaliable);

    }
}

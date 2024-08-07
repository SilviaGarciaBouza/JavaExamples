import java.util.Scanner;

public class MyOperators {
    public static void main(String[] args) {
        //Operadores aritméticos
        int a = 3, b = 2, resultado = 0; //creo 3 var juntas, hay q specificar tipo no vale poner var.hay q iniciarlos, resultado ponemos eliminar =0 pq es el valor por defecto
        resultado= a + b;
        resultado = a - b;
        resultado = a * b;
        resultado = a/ b;
        resultado = a%b;//a modulo b es el resto q queda tras dividir a entre b

        //Operadores unarios
        int c = 4, d = 5, result;// result = 0 por defecto
        boolean e = true;
        //Positivo +
        result = +c; // añadir + no altera, no se suele usar
        //negativo -
        result = -d; // cambia de signo
        c= 4;
        //Preincremento ++var   ---- Pre decremento con --
        result = ++c;//c es 4 desde ya
        //Postincremento ------preincremento con--
        c= 4;
        int results= c++;//ahora si imprimo c = 4 y en la siguiente vex¡z q use c será 5
        System.out.println("results = " + results);
        System.out.println("results = " + c);//5 se usa c

        //Operadores de asignación simple y compuestos:
        //= += -= *= /= %=
        var t = 5;//var hay q darle valor
        int u;// al indicar el tipo(int) se puede dar el valor más tarde
        u = 6;
        t += 5; // t = t + 5
        int v=8, w=9, x=8;
        System.out.printf(" a= %d , b= %d, c= %d", v, w, x);

        //Operadores de comparación o relacionales == compara si son iguales, != si es distinto, < <= > >=
        int aa = 3, bb = 4;
        var result3 = aa==bb;//false, para ver si es la misma dirección de memoria
        //usa equalals valor1.equals(valor2) para saber si tiene el mismo valor
        result3 = aa!=bb;//true
        result3= aa<=bb;//true
        result3 = aa<bb;//true
        result3 = aa>bb;//false
        result3= aa>=bb;//false



        //Operadores lógicos


        //&& y(devuelve true si los dos son true), || o  (devlve true si uno o el otro es true), ! cambia de true a false y viceversa
        boolean j= true, k = false;
        var result4 = j && k; //false
        result4 = j || k; //true, | es el caracter pipe (paip)
        result4= !j;//false
        
        

        //Ejercicio 1: el usuario nos da un valor y tenemos q saber si está dentro del rango 0-5
        System.out.println();
        final var MIN = 0;//COnst
        final var MAX = 5;
        System.out.println("Inserta un número");
        var scanner = new Scanner(System.in);
        var number = Integer.parseInt(scanner.nextLine());
        var myResultAnswer = number >= MIN && number <= MAX;
        System.out.println("myResultAnswer = " + myResultAnswer);

        //Ejercicio2: si es miembro de la tienda y compra 10 o + artículos se le hace descuento VIP
        System.out.println();
        boolean vip;
        boolean member;
        int articlesNumber;
        final var NARTICLES = 10;

        System.out.print("Inserta nº de artículos: ");
       var myScanner = new Scanner(System.in);
        articlesNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("¿Eres miembro?Respone true o false ");
        member = Boolean.parseBoolean(scanner.nextLine());

        vip = articlesNumber >= NARTICLES && member ==true;

        System.out.println(vip);
    }
}


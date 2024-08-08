import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        //Arrais:
        //Declarar e inicial:forma1. declaras para crear e inicializas para guardar espacio en memoria
        int[] myArray;
        myArray = new int[5];
        //Declarar e inicial:forma2 (usaremos esta)
        var array1 = new int[5];
        //Declarar e inicial:forma3
        int[] array2 = new int[5];

        //Modificar:si no se da valor tiene el de defaul
        array2[0] = 3;
        array1[1] = 21;
        array1[2] = 4;
        array1[3] = 8;
        array1[4] = 4;

        //Leer los elementos con el indice
        System.out.println(array1[2]);//el indice2(posicon 3)
        System.out.println(array1);//imprime la dirreccion de memoria del array, no sus valores
        //System.out.println(array1[6]);//marca error

        //sintaxis crear con los valores
        int[] array7 = {124,243,243,4231,42335,234,5241};
        var array6 = new int[] {23,214,2413,234,214,2143};//usaremos este

        //Iterar o imprimir toodos los arrays
        var array20 = new int[] {234,1235,325,5321};
        for(var i =0 ; i<array20.length;i++){
            System.out.println(array20[i]);
        }

        //Ejercicio 1

        var scanner = new Scanner(System.in);
        System.out.print("Insert a number: ");
        var numberNumbers = Integer.parseInt(scanner.nextLine());
        var arrayExample = new int[numberNumbers];
        System.out.println();
        for (var i =0; i<numberNumbers; i++){
            System.out.println("Write a number: ");
            arrayExample[i]= Integer.parseInt(scanner.nextLine());
        }
        for(var x=0; x<arrayExample.length;x++){
            System.out.println(arrayExample[x]);
        }



    }
}

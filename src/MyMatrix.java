import java.util.Scanner;

public class MyMatrix {
    public static void main(String[] args) {
        //Definición de matriz
        //opción 1:
        int[][] matrix1= new int [2][3];
        //opción 2: usaremos esta
        var matrix2 = new int[2][3];

        //Añadir datos:
        matrix2[0][0]= 100;
        matrix2[0][1]=200;
        matrix2[0][2]= 300;
        matrix2[1][0]=400;
        matrix2[1][1]=500;
        matrix2[1][2]= 600;

        //Recorrer la matriz e iterarlo0
        var myColumns= 3;
        var myRows =2;
        var matrix3 = new int[myRows][myColumns];
        matrix3[0][0]= 100;
        matrix3[0][1]=200;
        matrix3[0][2]= 300;
        matrix3[1][0]=400;
        matrix3[1][1]=500;
        matrix3[1][2]= 600;
        for (var ro=0; ro<myRows ;ro++){//recorre filas tb vale ro<matrix3.length
            for(var co=0; co<myColumns;co++){//recorre las columnas tb vale co<matrix3[ro].legth
                System.out.println("Matrix3["+ro+"]["+co+"]: " + matrix3[ro][co]);
            }
        }

        //Ejercicio introducir valores y crear


        var scanner = new Scanner(System.in);
        System.out.print("Write number of rows: ");
       var ROW = Integer.parseInt(scanner.nextLine());
        System.out.print("Write number of columns: ");
        var COLUMN = Integer.parseInt(scanner.nextLine());
        var matrix4= new int[ROW][COLUMN];
        for (var r=0; r<ROW;r++){
            for (var c=0; c<COLUMN;c++){
                System.out.print("Insert a number: ");
                matrix4[r][c] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println();
        for (var ri=0;ri<ROW;ri++ ){
            for (var ci=0; ci<COLUMN;ci++){
                System.out.println("Matrix4["+ri+"]["+ci+"]: " +matrix4[ri][ci]);
            }
        }

        //Ejemplo sumar diagonal de la matriz 3x3
        var matrix5 = new int[3][3];
        matrix5[0][0]=100;
        matrix5[0][1]=200;
        matrix5[0][2]=300;
        matrix5[1][0]=400;
        matrix5[1][1]=500;
        matrix5[1][2]=600;
        matrix5[2][0]=700;
        matrix5[2][1]=800;
        matrix5[2][2]=900;
        var sum=0;
        for(var rii=0; rii<3; rii++){
            for (var cii=0; cii<3;cii++){
                if (rii==cii){
                    sum= sum + matrix5[rii][cii];
                }
                else {continue;}
            }
        }
        System.out.println(sum);



    }
}

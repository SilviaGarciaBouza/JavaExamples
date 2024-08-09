package elements;

public class MyWhile {
    public static void main(String[] args) {
        //While
        var numberWhile = 1;
        while(numberWhile<=10){
            System.out.println(numberWhile);//System.out.println(numberWhile++) y me ahorro la línea de abajo
            numberWhile++;
        }
        System.out.println();


        //do while. Se ejecuta al menos una vez auq no se cumpla la condición
        var numberDoWhile = 0;
        do{
            System.out.println(numberDoWhile);
            numberDoWhile++;
        } while(numberDoWhile<=10);
        System.out.println();


        //For(inicialización;condición;actualización tras cada vuelta)
        for(int numberFor = 1; numberFor<5; numberFor++){
            System.out.println(numberFor);
        }
        System.out.println();


        //Break//Termina el bucle
        for(var numberBreak=1;numberBreak<=10;numberBreak++){
            System.out.println(numberBreak);
            break;
        }
        System.out.println();


        //Continue  //salta esa iteración del bucle y continúa //en este imprime impares

        for (var numberContinue=1;numberContinue <=10;numberContinue++){
            if(numberContinue%2 ==0){
                continue;
            }
            else {
                System.out.println(numberContinue);
            }
        }

    }
}

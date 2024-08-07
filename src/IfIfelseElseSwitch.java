public class IfIfelseElseSwitch {
    public static void main(String[] args) {
        //if  {} solo obligat si tienen 2o+líneas dentro
        if(2<4){
            System.out.println("2<4");
        }

        //if/ else
        var age = 10;
        if(age>=18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("eres menor de edad");
        }

        //else if puedes poner todos los else if q need

        var myAge = 2;
        if(myAge>=10){
            System.out.println("Eres mayor de edad");
        } else if (myAge>= 13 && myAge < 18){
            System.out.println("Eres un adolescente");
        } else {
            System.out.println("Eres un niño");
        }


        //Operador ternario: se hace en una línea.Condicon? exp1 exp2
        var numberOpTern = 3;
        var resultOpTern = (numberOpTern%2 == 0) ? "Par" : "Impar";
        //Si numberOpTern modulo 2 es 0 se asigna el valor de "Par", sino de "Impar"
        //Otro ej:
        var edad= 4;
        var mayorEdad = (edad>=18) ? "Soy mayor de edad" : "Soy menor de edad";
        //Anidado
        var menorEdad = (edad<18) ? "Soy menor de edad" : (edad>100) ? "Soy mayor de edad" : "Soy centenario";


        //switch(como when en kotlin)
        var numSelect = 1;
        String dayWeek;

        switch (numSelect){
            case 1:
                dayWeek = "Lunes";
                break;
            case 2:
                dayWeek = "Martes";
                break;
            default:
                dayWeek = "de miércoles a domingo";
                break;//este es opcional

        }
        //SImplificado
        switch (numSelect){
            case 1 -> dayWeek = "nose";
            case 2 -> dayWeek = "emqk";
            default -> dayWeek = "kewmclk";

        }
    }
}

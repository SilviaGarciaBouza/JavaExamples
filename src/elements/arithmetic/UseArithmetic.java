package elements.arithmetic;
//Importa de Arithmetics
import elements.arithmetic.Arithmetic;

public class UseArithmetic {
    public static void main(String[] args) {
        var arithmetic= new Arithmetic(3,4);
        arithmetic.setNumber1(2);
        arithmetic.setNumber2(3);
        arithmetic.setNumber2(5);
        System.out.println(arithmetic.addNumbers());
    }



}

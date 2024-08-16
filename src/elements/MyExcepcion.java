package elements;

public class MyExcepcion {
    public static void main(String[] args) {
        int a = 1;
        int b=0;

        //try con el código q quieras ejecutar
        try{
            int c = a/b;
            System.out.println(c);
            //catch con la excepción q crees q se puede dar: e es genérico
        } catch (Exception e){
            System.out.println("Excepción: "+e);

            //finally con un código q smpre se va a ejecutar al final
        }finally {
            System.out.println("Operación finalizada");
        }

    }
}

class MyExcepcion2{
    public static void main(String[] args) {
        var myEx = new MyExcepcion2();
        myEx.calculate(1,2);
    }
    public int calculate(int a, int b){
        if(b ==0){
            throw new RuntimeException("No se puede dividir entre 0");
        }
        return a/b;
    }
}


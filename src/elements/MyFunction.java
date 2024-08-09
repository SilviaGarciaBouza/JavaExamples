package elements;

public class MyFunction {
    static void sayHello(String message){
        //static tine q ver con la clase
        //void pq no devuelve nada
        //String message es el parámetro
    }

    //int pq devuelve int
    static int addSum(int a, int b){
        //var result s local solo  se puede acceder en el
        var result = a+b;
        return result;
    }

    public static void main(String[] args) {
        //Public q puede ser llamada dsd fuera de la clase
        //static tiene q ver con la clase
        //void q no tiene salida
        //las funciones llevan parámetros y cuando se llama a la fun se le meten argumentos(es lo msm)
        sayHello("Hi");
        //Hi es el argumento
        addSum(2,3);
        var result_function = addSum(1,2);
        isPair(3);


    }
    //Función recurrente se llama asi misma debe avanzar a un caso base para no caer en ciclo infinito
    static void recurrent(int a) {

        if (a == 10) {

        } else {
            recurrent(a - 1);
        }
    }
        static boolean isPair(int num){
            return (num%2 ==0)? true:false;
        }

}

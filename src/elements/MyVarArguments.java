package elements;

public class MyVarArguments {
    public static void main(String[] args) {
        printNumbers(1,2,3,4,5,6,7,8);
    }
    //arg variables, sabes el tipo(int)
    static void printNumbers(int... numbers){
        for(var i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }

    }
}

//arg no variables + arg variables
class MyVarArguments2{
    public static void main(String[] args) {
        printNumbersAndString("enkl",1,2,3,4,5);//El arg no variable SIEMPRE va antes q lo variable
    }
    static void printNumbersAndString(String name, int...numbers2){
        System.out.print(name+" ");
        for (var i=0; i<numbers2.length; i++){
            System.out.print(numbers2[i]+" ");
        }
    }
}

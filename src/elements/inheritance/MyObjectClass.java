package elements.inheritance;

public class MyObjectClass {
    //Todas las clases heredan de la class Object q tiene métodos como
    //equals()
    //toString() //indica paquete, la clase y la direccion de memoria
    //hashCode() //indica direccn de memoria
    //estas se pueden sobreescribir

    @Override
    public String toString(){
        return "Hello";
    }

    public static void main(String[] args) {
        var myObjectClass = new MyObjectClass();
        System.out.println(myObjectClass.toString());//
        System.out.println(myObjectClass);//si pones solo el nombre del objeto siempre se llama automáticamente a toString
    }
}

class MySecondObjectClass{
    @Override
    public String toString(){
        return "jijiiji" + super.toString();//super para q salga sin reescribir
    }

    public static void main(String[] args) {
        var my = new MySecondObjectClass();
        System.out.println(my);
    }
}

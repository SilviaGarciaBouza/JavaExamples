package elements;

public class MyStaticArgMethod {
    //atributos static se asocian con la class. Suele iniciarse el valor en la classy con cada objeto no se inicia
    static int objectCounter = 0;
    //atributo dinámico(el asociado a los objetos)
    private int age;

    //En el constructor para q con cada objeto creado aumente 1
   public MyStaticArgMethod(){
       objectCounter++;
   }

    public static void main(String[] args) {
       //Se puede acceder en desde los objetos pero mejor poner siempre la clase
        //Si no fuera static el valor se reiniciaría con cada objeto y siempre devolvería 1
        var myStaic = new MyStaticArgMethod();
        System.out.println(MyStaticArgMethod.objectCounter);
        var myStaic2 = new MyStaticArgMethod();
        System.out.println(MyStaticArgMethod.objectCounter);
    }
}
class MyThing{

    //puedes poner el argumento en privado y el get y el set en static y publicos
    private static int counter = 0;
    public static int getCounter() {
        return MyThing.counter;
    }
    public static void setCounter(int counter) {
        MyThing.counter = counter;
    }

    //constructor
    public MyThing(){
        MyThing.counter++;
    }

    public static void main(String[] args) {
        var myThing=new MyThing();
        System.out.println(MyThing.getCounter());

        var myThing2 = new MyThing();
        System.out.println(MyThing.getCounter());
    }

}


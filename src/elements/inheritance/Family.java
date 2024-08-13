package elements.inheritance;
//Clase padre
public class Family {
    protected void sayHiName(){
        System.out.println("Hi, I have a name.");
    }
    protected void sayMeel(){
        System.out.println("I eat a lot");
    }
    //el constructor q no es need poner si está bacío pq lo tiene por defecto:es para hacer objenos no hijos
    public Family(){
    }
}
//Clase hija: tiene tb las protected del padre.
class Son extends Family{
    public void sayBuy(){
        System.out.println("I told you buy");
    }
}
//Otra clase hija de Family, con sobreescritura de una fun
class Daughter extends Family{
    @Override//para modificar una fun del padre
    protected void sayHiName(){
        System.out.println("My name is Susan");
        super.sayHiName();//con super accedes a la función del padre sin modificar
    }
    @Override
    protected void sayMeel(){
        System.out.println("I eat honey");
    }

}
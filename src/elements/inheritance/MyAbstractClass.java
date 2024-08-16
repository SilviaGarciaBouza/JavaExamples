package elements.inheritance;

public class MyAbstractClass {
    public static void main(String[] args) {
       // var person = new Person(); ////la abstract class no se puede instanciar
        var adult = new Adult();
        adult.named();// se llama el método de la clase hija pq el padre esabstrato
    }
}

//class abstract es la q deja algún método abstract, sin derivar

abstract class Person{
    public abstract void named();
}
//La class hija si implementa el método abstract del padre no es abstract, si no pues hay q poner abstract
class Adult extends Person{
    //se puede poner @Override
    public void named(){
        System.out.println("My name is Silvia");
    }
}
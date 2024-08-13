package elements.inheritance;

public class UseFamily {
    public static void main(String[] args) {
        var family= new Family();
        family.sayHiName();
        family.sayMeel();
        //family.sayBuy();//es del hijo, no del padre


        var soni = new Son();//instanciamos la clase hija
        soni.sayHiName();//fun protected del padre
        soni.sayMeel();//fun protected del padre
        soni.sayBuy();//fun del hijo
        //soni.sayYes(); //no puede pq es privada del padre

        var susan = new Daughter();
        susan.sayHiName();


    }
}

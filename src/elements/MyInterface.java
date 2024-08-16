package elements;
//las interfaces son class con métodos abstratas y públicas, y otros métodos con implementación por default
//las class hijas no son hijas, son clases q implementan de pq no extienden de ellas, sino q las implementan por lo q tienen q implementar los métodos abstratos(es como un contrato)
//tambien , opcional, pueden reescribir los métodos por default.


public interface MyInterface {
    //Método público y abstrato
    void myTranslate();

    //Método con implementación por default
    default void translating(){
        System.out.println("I'm translating in.....");
    }
}
//class q implementa, no extends
class English implements MyInterface{
    //hay q implementar el método abstrato de la padre poniendo public
    public void myTranslate(){
        System.out.println("English");
    }

    //opcional sobreescribirel metodo default
    @Override
    public void translating(){
        System.out.println("I'm translating in english");
    }
}

//vamos a provar
class UseMyInterface{
    public static void main(String[] args) {
        //var myInterface = new MyInterface(); //no se puede instanciar una interface
        var english = new English();
        english.myTranslate();
        english.translating();
    }
}
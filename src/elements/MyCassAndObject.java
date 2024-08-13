package elements;

public class MyCassAndObject {
    //Cada archivo puede tener varias clases pero solo una public. NOrmalmente solo tne una con el same name del archivo
    //atributos(no pden ser var
    String name;
    int age;
    //Constructor(así vacío está por defecto si no se pone otro. Si se quiere tener además de otro hay q ponerlo
    //no se puede acceder persona1.Constructor. Se usa solo para crear el objeto
    //A partir de 2 ya se considera sobrecarga de constructores =>2
    public MyCassAndObject(){//public pq pueden cogerlo dsd otros sitios
    }
    public MyCassAndObject(int myAge){
        age = myAge;
    }
    //métodos
    void calculate(){
        System.out.println(age + 1);
    }
//se pone static a las fun q se llaman dentro de la main
    public static void main(String[] args) {
        //Objeto con el constructor primero:
        var persona1 = new MyCassAndObject();//Objeto: instacia de la clase
        persona1.age =2;//Sino empezan con valores 0
        persona1.name="kewn";
        persona1.calculate();
        //Objeto con el segundo constructor:
        var persona2 = new MyCassAndObject(3);
        persona2.calculate();
    }

}
//this: se refiere a dentro de lo q está. Puede indicar distinta cosacada vez
class Person {
    int number1;
    int number2;
    //normalmente los parámetros del constructor se llaman igual q los atributos de fuera. Para usar el del constructor dentro de él usaremos this(this es el de la clase)
    public Person(int number1, int number2){
        this.number1=number1;//this number el d la clase, number1 el del ()
        this.number2=number2;
    }
    void add(){
        var result = this.number1 + this.number2;//en este caso this se refiere a la clase grande, habla de los atributos
        System.out.println(result);
    }

    public static void main(String[] args) {
        var person1 = new Person(2,4);
    }

        }

        //Encapsulamiento. private/public set/get

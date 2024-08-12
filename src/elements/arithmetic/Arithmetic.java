package elements.arithmetic;
//encapsulamiento: pon private los atributos y publicos otros con get y set para acceder a ellos dsd otro archivo
public class Arithmetic {

    //atributos int nunca var. private no se puede acceder dsd otro archivo
    private int number1;
    private int number2;



    //Constructor:
    public Arithmetic(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;//this el de la clase, number el del ()

    }

    //public se puede acceder dsd otro archivo
    public int addNumbers(){
        //this es el de la clase
        return this.number1 + this.number2;

    }

    //get para usar el atributo en otros archivos
    public int getNumber1(){
        return this.number1;
    }

    //set para modificar el atributo en otros archivos.
    public void setNumber1(int number1){
        this.number1= number1;
    }
    public int getNumber2(){
        return this.number2;
    }
    public void setNumber2(int number2){
        this.number2 = number2;
    }

}

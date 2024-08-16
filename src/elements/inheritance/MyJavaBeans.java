package elements.inheritance;
//Debe tener un constructor vacío(aunq puede ter más
//tne encapsulamnto: atributos privados y get/set para acceder a ellos
//Debe implementar la interface Serializable(q permite enviar los objetospor la red o a disco duro.

import java.io.Serializable;

//3: implement Serializable:
public class MyJavaBeans implements Serializable {
    //1: Constructor vacío:
    public MyJavaBeans(){

    }


    //2:encapsulamiento:
    private int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

//prueba
class USeMyJavaBeans{
    public static void main(String[] args) {
        var myJavaBeans = new MyJavaBeans();
        myJavaBeans.setAge(3);
        System.out.println(myJavaBeans.getAge());
    }
}

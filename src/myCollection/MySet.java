package myCollection;

import java.util.Set;
import java.util.TreeSet;

//No respetan el orden de los elementos(TreeSet sí q lo respeta)
//No permiten elementos repetivos, simplemente los ognora
public class MySet {
    public static void main(String[] args) {
        Set<String> mySet = new TreeSet<>();
        mySet.add("hola");
        mySet.add("hola");//este lo ignora
        mySet.add("adiós");
        mySet.add("hasta pronto");
        mySet.remove("adiós");
        mySet.forEach(System.out::println);



    }
}

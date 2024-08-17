package myCollection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
//Las listas respetan el orden de los elementos
//las listas permiten elementos duplicados
public class myList {
    public static void main(String[] args) {

        List<String> my0List =  Arrays.asList("1","2","3");//si ponemos <Object> es genérico y vale cualqr tipo de dato: sTring, int...
        for(String number: my0List){
            System.out.println(number);
        }
        my0List.forEach(number0-> System.out.println(number0));
        my0List.forEach(System.out::println);
        my0List.forEach(System.out::println);


        System.out.println();


        List<String> myList = new ArrayList<>();
        myList.add("aaaa");
        myList.add("eeee");
        myList.add("iiii");
        myList.add("oooo");
        myList.add("uuuu");
        myList.add("aaaa");//Permite duplicados

    //forEach
    for(String element: myList) {
        System.out.println(element);
    }

    //forEach con fun lambda
    myList.forEach(element1->{
        System.out.println(element1);
    });

    //forEach cn métodos státicos, de referencia.Pero así no es tan claro
        myList.forEach(System.out::println);








}}

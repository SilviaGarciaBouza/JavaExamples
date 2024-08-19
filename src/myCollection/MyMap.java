package myCollection;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        //Crea el map: Map<Tipo de dato de la llave, tipo de dato del valor> nombre = new en este caso HAsMAp(es una subclase pq map es abstrata o interface
        Map<String, String> person = new HashMap<>();
        //Añade los elementos
        person.put("name", "Silvia");
        person.put("apellido", "García");
        person.put("age","36");//Si en tipo dato valor fuera Object podría poner aquí un Int
        person.put("name", "Silvia");//ignora los repetidos y modifica si cambias el valor
        //Usarlos, primero se crea un set y después imprime o lo q quieras
        person.entrySet().forEach(System.out::println);//no respeta orden

        System.out.println();

        person.put("name", "Sonia");//modifica
        person.remove("age");//borra
        person.entrySet().forEach(System.out::println);

        System.out.println();

        //para acceder a la clave y valor por separado:

        person.forEach((key, value)-> {
            System.out.println("key: "+key+", value: "+value);
        });




           }
}

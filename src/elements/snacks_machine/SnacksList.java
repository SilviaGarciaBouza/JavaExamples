package elements.snacks_machine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SnacksList implements Serializable{
    //final pq no vamos a cambiarla
    public static final List<Snack> snacksListAvaliables;
    //para inicializar lo static pq lo static tiene q estar inicializado se puede poner lo siguiente:
    static{
        snacksListAvaliables = new ArrayList<>();
      //TODO  snacksListAvaliables.add("Fruit",3);
     //TODO   snacksListAvaliables.add("Apple pie", 5);
    }

    public void addSnack(Snack newSnack){



    }


}

package elements.snacks_machine;

import java.io.Serializable;
import java.util.Objects;
//para podel enviar los datos tne q implementar Serializable, ter constructior vacío...
public class Snack implements Serializable {

    //args static
    private static int snackCount=0;
    //args no statuc
    private int idSnack;
   private String nameSnack;
    private double priceSnack;
    //constructor vacío
    public Snack(){
        this.idSnack = ++Snack.snackCount;
    }
    //constructor:
    public Snack(String name, double price){
        this();//manda llamr al constructor vacío.(la llamada al constructor vacio smpre en la primera línea del otro construnctor si la pones pq sino fallo) Sino poner la siguiente Línea:
        // this.idSnack = ++Snack.snackCount;
        this.nameSnack = name;
        this.priceSnack = price;

    }
    //Métodos:
            //snackCount
    public static int getSnackCount() {
        return snackCount;
    }

    //este lo sacamos pq no queremsos q pueda ser modificado
   // public static void setSnackCount(int snackCount) {
        //this.snackCount = snackCount;
  //  }
            //idSnack
    public int getIdSnack(){
        return idSnack;
    }
    /* tampoco qremos q se cambie
    public void setIdSnack(int id){
        this.idSnack = id;
    }*/
            //nameSnack
    public String getNameSnack(){
        return nameSnack;
    }
    public void setNameSnack(String name){
        this.nameSnack = name;
    }
            //priceSnack
    public double getPriceSnack(){
        return priceSnack;
    }

    public void setPriceSnack(double price){
        this.priceSnack = price;
    }

    //toString: para la list

    @Override
    public String toString() {
        return "Snack{" +
                "idSnack=" + idSnack +
                ", nameSnack='" + nameSnack + '\'' +
                ", priceSnack=" + priceSnack +
                '}';
    }
    //equals y hascode(loe das al boton dcho y generar para la list

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(priceSnack, snack.priceSnack) == 0 && Objects.equals(nameSnack, snack.nameSnack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nameSnack, priceSnack);
    }





}

package elements.animals;

public class Animal {
    private String nameAnimal;
    private int numberAnimals;

    //construcctor.
    public Animal(int numberAnimals, String nameAnimal){
        this.nameAnimal = nameAnimal;
        this.numberAnimals = numberAnimals;
    }


    public int addAnimal(){
        return this.numberAnimals +9;
    }

    public int getNumberAnimals() {
        return this.numberAnimals;
    }
    public void setNumberAnimals(int numberAnimals){
        this.numberAnimals =numberAnimals;
    }
    public String getNameAnimal(){
        return this.nameAnimal;
    }
    public void setNameAnimal(String nameAnimal){
        this.nameAnimal =nameAnimal;
    }
}

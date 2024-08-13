package elements.animals;

public class UseAnimal {
    public static void main(String[] args) {
        var animal = new Animal(3, "Bear");
        animal.setNumberAnimals(4);
        animal.setNameAnimal("Lion");
        animal.addAnimal();
        System.out.println(animal.addAnimal());
        System.out.println(animal.getNameAnimal());
        System.out.println(animal.getNumberAnimals());
    }
}

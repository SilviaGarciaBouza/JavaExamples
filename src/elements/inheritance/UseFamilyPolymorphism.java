package elements.inheritance;

//polimorfismo, se usa siempre la clase más hija q se pueda

public class UseFamilyPolymorphism {
    static void printSayBuy(Family member ){//(Family member) member pde se de la clase Family, daugter o son
        member.sayMeel();
    }

    public static void main(String[] args) {
        var albert = new Family();
        printSayBuy(albert);// usa el sayMeel de Family, la clase padre

        var sil = new Daughter();
        printSayBuy(sil);//usa el sayMeel de la clase Daugther, la hija
    }
}

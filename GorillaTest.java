public class GorillaTest {
    public static void main(String[] args){
        Gorilla gorilla = new Gorilla(100);
        gorilla.throwSomething();
        System.out.println(gorilla.mammalEnergy);
        gorilla.throwSomething();
        System.out.println(gorilla.mammalEnergy);
        gorilla.throwSomething();
        System.out.println(gorilla.mammalEnergy);
        gorilla.eatBananas();
        System.out.println(gorilla.mammalEnergy);
        gorilla.eatBananas();
        System.out.println(gorilla.mammalEnergy);
        gorilla.climb();
        System.out.println(gorilla.mammalEnergy);
    }
}

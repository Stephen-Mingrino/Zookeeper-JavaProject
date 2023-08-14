public class Gorilla extends Mammal {
    public Gorilla(int mammalEnergy){
        super(mammalEnergy);
    }
    public void throwSomething() {
        System.out.println("the gorilla has thrown something");
        mammalEnergy -= 5;
    }
    public void eatBananas() {
        System.out.println("the gorilla just ate a banana");
        mammalEnergy += 5;
    }
    public void climb() {
        System.out.println("the gorilla has climbed a tree");
        mammalEnergy -= 10;
    }
}

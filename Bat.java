public class Bat extends Mammal {
    public Bat(){
        super(300);
    }
    public void fly(){
        System.out.println("the Bat takes off. swoosh");
        mammalEnergy-= 50;
        displayEnergy();
    }
    public void eatHumans(){
        System.out.println("the bat ate some humans and gained 25 energy");
        mammalEnergy += 25;
        displayEnergy();
    }
    public void attackTown(){
        System.out.println("the Bat attacks a town and loses 100 energy");
        mammalEnergy-= 100;
        displayEnergy();
    }
}

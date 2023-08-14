public class BatTest {
    public static void main(String[] args){
        Bat bat = new Bat();

        bat.attackTown();
        System.out.println(bat.mammalEnergy);
        bat.attackTown();
        System.out.println(bat.mammalEnergy);
        bat.attackTown();
        System.out.println(bat.mammalEnergy);
        bat.eatHumans();
        System.out.println(bat.mammalEnergy);
        bat.eatHumans();
        System.out.println(bat.mammalEnergy);
        bat.fly();
        System.out.println(bat.mammalEnergy);
        bat.fly();
        System.out.println(bat.mammalEnergy);
    }
}

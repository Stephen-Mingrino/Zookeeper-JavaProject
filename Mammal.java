public class Mammal {
    public int  mammalEnergy = 100;

    public int displayEnergy() {
        System.out.println("Energy:" + mammalEnergy);
        return mammalEnergy;
    }
    public Mammal(int mammalEnergy){
        this.mammalEnergy = mammalEnergy;
    }



}
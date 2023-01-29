package Dekorier_Muster;

public class Caramell implements Getränk {

    Getränk getränk;

    public Caramell(Getränk getränk){
        this.getränk = getränk;
    }

    @Override
    public String Beschreibung() {
        return this.getränk.Beschreibung() + " Caramell";
    }

    @Override
    public double cost() {
        return this.getränk.cost() + 0.2;
    }
}

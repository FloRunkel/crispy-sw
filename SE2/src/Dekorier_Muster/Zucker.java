package Dekorier_Muster;

public class Zucker implements Getränk{
    Getränk getränk;

    public Zucker( Getränk getränk){
        this.getränk = getränk;
    }

    @Override
    public String Beschreibung() {
        return this.getränk.Beschreibung() + " Zucker";
    }

    @Override
    public double cost() {
        return this.getränk.cost() + 0.1;
    }
}

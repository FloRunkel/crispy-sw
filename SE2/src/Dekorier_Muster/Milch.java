package Dekorier_Muster;

public class Milch implements Getränk{

    Getränk getränk;

    public Milch(Getränk getränk){
        this.getränk = getränk;
    }
    @Override
    public String Beschreibung() {
        return this.getränk.Beschreibung() +  " Milch";
    }

    public double cost(){
        return this.getränk.cost() + 1.19;
    }
}

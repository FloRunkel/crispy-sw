package Dekorier_Muster;

public class Espresso implements Getränk {

    @Override
    public String Beschreibung() {
        return "Espresso mit: ";
    }

    @Override
    public double cost() {
        return 2;
    }
}

package Dekorier_Muster;

public class Caffee implements Getränk{

    @Override
    public String Beschreibung() {
        return "Caffe mit:";
    }

    @Override
    public double cost() {
        return 2.5;
    }

}

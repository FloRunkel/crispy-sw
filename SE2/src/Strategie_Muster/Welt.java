package Strategie_Muster;

public class Welt {

    public static void main(String[] args){
        Hund dogo = new CityHund(new StrategieRennen());
        System.out.println("Hallo ich bin Hund dogo:");
        dogo.laufen();

        Hund bello = new CityHund(new StrategieGehen());
        System.out.println("Hallo ich bin Hund bello:");
        bello.laufen();
    }
}


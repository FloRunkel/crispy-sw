package Strategie_Muster;

public class StrategieGehen implements ILaufVerhalten{

    // konkrete Strategie gehen (laufen methode wird defieniert)
    @Override
    public void laufen() {
        System.out.println("geht gemütlich Spazieren");
    }
}

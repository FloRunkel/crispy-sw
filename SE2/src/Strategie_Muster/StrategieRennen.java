package Strategie_Muster;

public class StrategieRennen implements ILaufVerhalten {

    //konkrete Strategie Rennen (laufen methode wird defieniert)
    @Override
    public void laufen() {
        System.out.println("rennt schnell!");
    }
}

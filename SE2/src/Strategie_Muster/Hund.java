package Strategie_Muster;

public class Hund {

    // man könnte hier eine Default Strategie setzten
    ILaufVerhalten laufverhalten;

    public Hund(ILaufVerhalten laufverhalten){
        this.laufverhalten=laufverhalten;
    }

    public void laufen(){
        this.laufverhalten.laufen();
    }
}

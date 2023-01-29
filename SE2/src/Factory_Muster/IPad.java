package Factory_Muster;
import java.util.Random;

public class IPad implements AppleProdukte {
    int modelnr;

    public IPad(int modelnr){

        this.modelnr=modelnr;
    }

    @Override
    public int getModelNr() {

        return modelnr;
    }


}

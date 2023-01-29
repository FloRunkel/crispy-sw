package Factory_Muster;

public class Adapter implements AppleProdukte{
    Adaptee adaptee;

    public Adapter(Adaptee ae){
        this.adaptee = ae;
    }
    @Override
    public int getModelNr() {
        return this.adaptee.spezificModelNr();
    }
}

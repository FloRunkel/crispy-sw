package Factory_Muster;

public class Mac implements AppleProdukte{
     int modelnr;

     private Mac(int modelnr){
          this.modelnr=modelnr;
     }
     @Override
     public int getModelNr() {
          return modelnr;
     }

     public static Mac create(){
          System.out.println("Mac modelnr: "+ (int) Math.random());
          return new Mac((int)Math.random());
     }

}

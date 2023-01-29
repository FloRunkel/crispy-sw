package Factory_Muster;

import java.util.Scanner;
import java.util.logging.Logger;

public class AppleFactory {

    private static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static IPad instance;

    private static IPad createIpad(){
        System.out.println("Ipad modelnr: "+ Math.random());
        return new IPad((int) Math.random());
    }

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        int eingabe = sc.nextInt();
        sc.close();

         if (eingabe == 1){
             IPad ipad = AppleFactory.createIpad();
             ipad.getModelNr();
             log.info("This is a IPad Applefactory");
         }
         else if (eingabe == 2){
            Mac.create();
            log.info("This is a Mac Applefactory");
         }
         else {
             AppleProdukte ap = new Adapter(new Adaptee());
             System.out.println(ap.getModelNr());
         }
    }
}

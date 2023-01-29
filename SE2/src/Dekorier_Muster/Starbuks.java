package Dekorier_Muster;

public class Starbuks {

    public static void main(String args[]){
        Getränk franziGetränk = new Caramell( new Milch(new Caffee()));
        System.out.println(franziGetränk.Beschreibung());
        System.out.println(franziGetränk.cost());

    }
}

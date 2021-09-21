package srcpackage;

public class DoWhileSchleife {

    public static void main(String[] args) {

        int ausdauer = 7;

        //Loop der eine Nachricht ausgibt bis die Ausdauer auf 0 fällt.
        do{
            System.out.println("Du bist einen Stunde Fahrrad gefahren, vergiss nicht eine Pause einzulegen.");
            ausdauer--;
        }
        while(ausdauer > 0);
        System.out.println("Dein Kreislauf ist kollabiert!");
    }
}

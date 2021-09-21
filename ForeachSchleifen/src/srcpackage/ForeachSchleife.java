package srcpackage;

public class ForeachSchleife {

    public static void main(String[] args) {

        //foreach kann nur Lesen
        String[] cryptos = {"Bitcoin", "Ethereum", "Dogecoin", "PI"};

        for(String crypto : cryptos){
            System.out.println(crypto);
        }

    }
}

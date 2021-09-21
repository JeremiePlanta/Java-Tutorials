package srcpackage;

public class ForeachSchleife {

    public static void main(String[] args) {

        String[] cryptos = {"Bitcoin", "Ethereum", "Dogecoin", "PI"};

        //Dieser for Loop gibt die Elemente des cryptos array wieder und ruft dafür die Länge des arrays ab.
        for(int i = 0; i < cryptos.length; i++){
            System.out.println(cryptos[i]);
        }

        //Dieser foreach Loop gibt die Elemente des cryptos array wieder indem er eine Kopie des Elementes weiter gibt.
        for(String crypto : cryptos){
            System.out.println(crypto);
        }

    }
}

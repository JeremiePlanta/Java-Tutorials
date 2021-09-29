package srcpackage;

public class Methoden {

    public static void main(String[] args) {
        Methoden.reisen();
        reisen(99);
    }
    
    public static void reisen(){
        int geheimeGeheimFormel = 17;
        System.out.println("Sie sind "+ geheimeGeheimFormel + "Km gereist.");
    }
    public static void reisen(int a){
        System.out.println("Sie sind "+ a + "Km gereist.");
    }
}

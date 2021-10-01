package srcpackage;

public class MethodenInKlassen {

    public void nurInstanz(){
        System.out.println("Ich bin nur über eine Instanz aufrufbar.");
    }

    public static void ausserhalb(){
        System.out.println("Mich kann mann auch ohne Instanz benutzen.");
    }
    public static void main(String[] args) {

        MethodenInKlassen objekt = new MethodenInKlassen();   //Instanziierung
        objekt.nurInstanz();
        ausserhalb();
    }
}

package srcpackage;

public class SwitchCaseAbfrage {

    public static void main(String[] args) {

        String methode = "Dietrich";

        switch(methode){
            case "Eintreten":
                System.out.println("Ihr tretet ein Loch in die Tuer und bleibt stecken.");
                break;
            case "Dietrich":
                System.out.println("Selbst nach einer Stunde herumprobieren wisst ihr immernoch nicht wie ein Dietrich richtig verwendet wird");
                break;
            case "Klinke benutzen":
                System.out.println("Die Tuer geht auf.");
                break;
            default:
                System.out.println("Es passiert nichts.");
        }

    }
}

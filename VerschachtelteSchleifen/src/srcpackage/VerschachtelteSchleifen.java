package srcpackage;

public class VerschachtelteSchleifen {

    public static void main(String[] args) {

        /*ein Zwei schichten array das von klasse 1 bis 3, für damage iteration 1 bis 4, eine klassenspezifische Nachricht
        ausgibt. Und Zusätzlich noch eine Nachricht die das Ende der 4 Nachrichten markiert. */
        for(int klasse = 1; klasse < 4 ; klasse++){
            for (int damage = 1; damage < 5; damage++){

                switch(klasse){
                    case 1:
                        System.out.println("The mages Fireball did " + damage*3);
                        break;
                    case 2:
                        System.out.println("The Warriors Axe did " + damage*2);
                        break;
                    case 3:
                        System.out.println("The healers miserable punches did " + damage);
                        break;
                    default:
                        break;
                }
            }
            System.out.print("The Fight is over.\n \n");
        }

    }
}

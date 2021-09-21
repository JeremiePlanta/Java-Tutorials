package srcpackage;

public class VerschachtelteSchleifen {

    public static void main(String[] args) {

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

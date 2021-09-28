package srcpackage;

public class MehrdimensionaleArrays {

    public static void main(String[] args) {

        String[][] personAndWeapon = new String[3][2];

        personAndWeapon[0][0] = "Hildegard";
        personAndWeapon[0][1] = "Streitaxt";

        personAndWeapon[1][0] = "Nephalia";
        personAndWeapon[1][1] = "Zepter";

        personAndWeapon[2][0] = "Barbosa";
        personAndWeapon[2][1] = "Säbel";

        //methode 1
        for (int i =0; i < personAndWeapon.length ;i++){
            for (int j =0; j < personAndWeapon[i].length ;j++){
                System.out.print(personAndWeapon[i][j]+" ");
            }
            System.out.print("\n");
        }

        //methode 2
        for (String[] personAndWeaponGroup : personAndWeapon){
              for (String personAndWeaponElement :personAndWeaponGroup){
                  System.out.print(personAndWeaponElement + " ");
              }
            System.out.print("\n");
        }

    }
}

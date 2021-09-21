package srcpackage;

public class Arrays {

    public static void main(String[] args) {

        String[] names = new String[3]; //festlegung der Größe des Arrays

        names[0] = "Karlsson";
        names[1] = "Karlssonsson";
        names[2] = "Karlssonssonsson";
        
        //Ausgabe der elemente des arrays über einen for Loop
        for(int i =0; i < names.length; i++){
            System.out.println(names[i]);
        }


        String[] lannisters = {"Tyrion","Jaime","Tywin","Cersei","Kevan"};

        for(String character : lannisters ){
            System.out.println(character);
        }
    }
}

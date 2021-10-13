package srcpackage;

public class Panzer
{
    private String fortbewegung = "Ketten";

    public Panzer(){
        
    }
    public Panzer(String fb){
        fortbewegung = fb;
    }
    public void wieBewegtSichDerPanzer(){
        System.out.println("Dieser Panzer fährt mit "+ fortbewegung);
    }
}

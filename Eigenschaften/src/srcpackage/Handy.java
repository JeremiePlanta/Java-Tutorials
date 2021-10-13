package srcpackage;

public class Handy {

    public String hintergrund = "Shrekt";
    private String marke = "Huawei";

    public void einschalten(){
        System.out.println("Das Handy ist nun eingeschaltet.");
    }

    public String getMarke()
    {
        return marke;
    }
    public void setMarke(String m){
        marke = m;
    }
}

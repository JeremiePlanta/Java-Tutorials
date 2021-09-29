package srcpackage;

public class MethodenMitRueckgabewert {

    public static void main(String[] args) {
        System.out.println("There are " + horses(17) + " horses.");
    }
    public static int horses (int legs){
        return legs / 4;
    }
}

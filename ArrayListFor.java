import java.util.ArrayList;
public class ArrayListFor{
    public static void main(String args[]){
        ArrayList<String> ar = new ArrayList<>();
        ar.add("vivek");
        ar.add("cvb");
        ar.forEach((num) -> { System.out.println(num);});
    }
}
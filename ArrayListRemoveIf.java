import java.util.ArrayList;
public class ArrayListRemoveIf {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("vivek");
        ar.add("Rana");
        ar.removeIf(n -> ( n == "vivek"));
        System.out.println(ar);
    }
}

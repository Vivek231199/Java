import java.util.ArrayList;
import java.util.Spliterator;
public class ArrayListSpliterator {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("vivek");
        ar.add("moodle");
        Spliterator<String> sp = ar.spliterator();
        sp.forEachRemaining((n) -> System.out.println(n));
    }
}

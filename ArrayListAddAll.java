import java.util.ArrayList;
class ArrayListAddAll{
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("vivek");
        a1.add("Rana");
        System.out.println(a1);
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("vi");
        a2.add("Ra");
        a1.addAll(a2);
        System.out.println(a1);


    }
   
}

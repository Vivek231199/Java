import java.util.ArrayList;
class ArrayListIndexOf{
    public static void main(String args[]){
        ArrayList<String> ar = new ArrayList<>();
        ar.add("A");
        ar.add("B");
        ar.add("C");
        for(String v:ar){
            System.out.println(v);
        }
        int sd = ar.indexOf("C");
        System.out.println("Second position of arraylist:" + sd);
    }
}
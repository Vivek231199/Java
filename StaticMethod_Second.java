public class StaticMethod_Second {
    static int age = m1();
    static int m1(){
        return 22;
    }
    public static void main(String arg[]){
        System.out.println(age);
    }
}


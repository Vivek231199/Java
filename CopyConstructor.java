/* copy constructor */
public class CopyConstructor {
    private int a,b;
    public CopyConstructor(int a,int b){
        this.a = a;
        this.b = b;
    }
    public CopyConstructor(CopyConstructor c2){
        this.a = c2.a;
        this.b = c2.b;
        System.out.println(this.a + " " + this.b);
    }
    public static void main(String arg[]){
        CopyConstructor c = new CopyConstructor(1,2);
        CopyConstructor c1 = new CopyConstructor(c);
        System.out.println(c1);
    }
}

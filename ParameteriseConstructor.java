/* Parameterise constructor */
public class ParameteriseConstructor {
    int x,y;
    public ParameteriseConstructor(int x,int y) {
        this.x = x;
        this.y = y;
        System.out.println(this.x + " " + this.y);
    }
    
    public static void main(String[] args) {
        ParameteriseConstructor pc = new ParameteriseConstructor(10,22);

    }
}

public class Recursion{
    public int factorial(int x){
        if(x == 0 || x == 1){
            return x;
        }
        else{
            return x * factorial(x - 1);
        }
    }
    public static void main(String args[]){
        Recursion r = new Recursion();
        int result = r.factorial(4);
        System.out.print("Factorial is:" + result);
    }
}

public class Recursion_sum {
    public int sum(int x){
        if(x == 0){
            return x;
        }
        else{
            return x + sum(x - 1);
        }
    }
    public static void main(String args[]){
        Recursion_sum rs = new Recursion_sum();
        System.out.println(rs.sum(3));
    }
}

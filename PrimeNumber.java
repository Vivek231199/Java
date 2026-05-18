public class PrimeNumber{
    public void prime_number(int n){
        for(int i = 2;i<=n;i++){
            int count = 0;
            for(int j=1;j<=i;j++){
                if(i % j == 0){
                    count ++;
                }
            }
            if(count == 2){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        PrimeNumber p = new PrimeNumber();
        p.prime_number(10);
    }
}

public class ArrayLargest {
    public static void main(String[] args) {
        int[] arr = {5,9,2,1,8};
        for(int i = 0;i < arr.length;i++){
            for(int j=0;j < arr.length-i-1;j++){
                if(arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[2]);
    }
}

public class LinearSearch {
    public static int findIndex(int[] arr,int target){

        for(int i=0;i< arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] data = {112,22,56,1};
        int ts = 22;
        int result = findIndex(data,ts);
        if(result != -1){
            System.out.println(result);
        }
        else{
            System.out.println("no");
        }
    }
}

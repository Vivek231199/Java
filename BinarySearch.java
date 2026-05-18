public class BinarySearch {
    public static int findIndex(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start  + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target){
                end = mid - 1;
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

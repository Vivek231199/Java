public class SelectionSort {
    public static void selectionsort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minposition = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minposition]){
                    minposition = j;
                }
            }
            int temp = arr[minposition];
            arr[minposition] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String args[]){
        int[] data = {112,1,4,55};
        selectionsort(data);
        for(int v:data){
            System.out.println(v);
        }
    }
}

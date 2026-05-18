/* bubble sort sorting method */
class BubbleSort {
    public static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean swapped = true;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                    swapped = false;
                }
            }
            if(!swapped) break;
        }
    }
    public static void main(String args[]){
        int[] data = {112,2,5,6};
        bubblesort(data);
        for(int a:data){
            System.out.println(a);
        }
    }
}

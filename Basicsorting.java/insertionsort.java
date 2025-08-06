public class insertionsort {
    public static void insertionsort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding out correct position to insert
            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--; 
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void printArr(int arr[]) {
        for(int curr=0; curr<arr.length; curr++) {
            System.out.print(curr + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        int arr[] = {4, 2, 3, 8, 6, 5};
        insertionsort(arr);
        printArr(arr);
    }
    
}

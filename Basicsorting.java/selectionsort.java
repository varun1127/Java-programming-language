public class selectionsort {
    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr( int arr[]) {
        for(int minPos=0; minPos<arr.length; minPos++) {
            System.out.print(arr[minPos] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        int arr[] = { 4, 3, 5, 6, 9};
        selectionSort(arr);
        printArr(arr);
    }
}

public class Bubblesort {
    public static void Bubblesort(int arr[]) {
        for( int turn=0; turn<arr.length; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {2, 6, 5, 8, 3, 4};
        Bubblesort(arr);
        printArr(arr);
    }
    
}

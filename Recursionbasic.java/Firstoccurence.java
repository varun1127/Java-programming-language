public class Firstoccurence {
    public static int Firstoccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return Firstoccurence(arr, key , i+1);
    }
    public static void main(String args[]) {
        int arr[] = {2,4,5,6,3,9,8};
        System.out.println(Firstoccurence(arr,9,0));
    }
    
}

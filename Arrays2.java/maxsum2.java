import java.util.*;


public class maxsum2 {
    public static void maxsum(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=0; j<numbers.length; j++) {
                int end = j;
                
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start];

                if(maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum is : " + maxsum);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        maxsum(numbers);
    }
}

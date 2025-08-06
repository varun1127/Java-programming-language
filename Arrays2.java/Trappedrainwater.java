import java.util.*;

public class Trappedrainwater {
    public static int rainwater(int height[]) {
        int n = height.length;
        //calculate left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];

        for(int i=1; i<n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //claculate right max boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trapped_water = 0;
        //loop
        for(int i=0; i<n; i++) {
            //water level = min(left max bound - right max bound)
          int  waterlevel = Math.min(leftmax[i], rightmax[i]);
           //trapped water = waterlevel - height[i]
          trapped_water += waterlevel - height[i];
        }
        return trapped_water;
    }

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(rainwater(height));

    }
}

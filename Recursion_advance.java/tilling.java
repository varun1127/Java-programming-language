public class tilling {
    public static int tillingproblem(int n) { // floor = 2xn
        if(n == 0 || n == 1) {
            return 1;
        }
        //for vertical
        int fnm1 = tillingproblem(n-1);
        //for horizontal
        int fnm2 = tillingproblem(n-2);
        //total
        int totalways = fnm1 + fnm2;
        return totalways;

    }
    public static void main(String args[]) {
        System.out.println(tillingproblem(4));

    }
}
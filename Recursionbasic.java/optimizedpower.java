public class optimizedpower {
    public static int optimizedpower(int a, int n) {
        if(n ==0) {
            return 1;
        }
        int halfpower = optimizedpower(a, n/2);
        int halfpowersq = halfpower * optimizedpower(a, n/2);

        //if odd
        if(n % 2 !=0) {
            halfpowersq = a * halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String args[]) {
        int a = 2;
        int n = 4;
        System.out.println(optimizedpower(a, n));
    }
    
}

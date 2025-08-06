public class power {
    public static int power(int n, int x) {
        if(n ==0) {
            return 1;
        }
        return x * power(n-1,x);
    }
    public static void main(String args[]) {
        
        System.out.println(power(5, 2));
    }
    
}

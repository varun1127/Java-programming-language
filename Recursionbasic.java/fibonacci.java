public class fibonacci {
    public static int fibonacci(int n) {
        if( n == 0 || n == 1) {
            return n;
        }
        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        int fib = fibnm1 + fibnm2;
        return fib;
    }
       
    public static void main(String args[]) {
        int n = 25;
        fibonacci(n);
        System.out.println(fibonacci(n));
    }
    
}

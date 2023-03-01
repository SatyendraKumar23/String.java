public class fibonacci {
    public static int fib(int n)
    {
        if(n==1 || n==0)
        {
            return n;
        }
        int n_1=fib(n-1);
        int n_2=fib(n-2);
        int fiboN=n_1+n_2;
        return fiboN;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(fib(n));
    }
    
}

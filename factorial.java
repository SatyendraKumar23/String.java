import java.util.*;
public class fctorial {
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int n_1=fact(n-1);
        int fac=n*n_1;
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
    
}

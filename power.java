public class powerofN {
    public static int powerof(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int n_1=powerof(x,n-1);
        int powern=x*n_1;
        return powern;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        System.out.println(powerof(x,n));
    
}
    
}

public class tilingproblem {
    public static int tiles(int n)//2xn
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        //vertical
        int fm1=tiles(n-1);
        //horizontal
        int fm2=tiles(n-2);
        //total ways
        int fnm=fm1+fm2;
        return fnm;
    }   
    public static void main(String[] args) {
        int n=3;
        System.out.println(tiles(n));
    }
    
}

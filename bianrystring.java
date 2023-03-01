public class binarystring {
    public static void binarystring(int n,int lastplace,String str){
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        //choices
        
        binarystring(n-1,0,str+"0");

        if(lastplace==0)
        {
            
            binarystring(n-1,1,str+"1");
        }
        

    }
    public static void main(String[] args) {
        int n=3;
        int lastplace=0;
        String str=new String(" ");
        binarystring(n,lastplace,str);
    }
    
}

public class removeduplicate {
    public static void dublicate(String str,int idx,StringBuilder sb,boolean map[])
    {
        if(idx==str.length())
        {
            System.out.println(sb);
            return;

        }
        char currarr=str.charAt(idx);
        if(map[currarr-'a']==true)
        {
            //duplicate
            dublicate(str,idx+1,sb,map);
        }
        else{
            map[currarr-'a']=true;
            dublicate(str,idx+1,sb.append(currarr),map);
        }
        

    }
    public static void main(String[] args) {
        String str="satyendrakumar";
        int idx=0;
        StringBuilder sb=new StringBuilder(" ");
        boolean map[]= new boolean[26];
        dublicate(str,idx,sb,map);

        
    }
    
}

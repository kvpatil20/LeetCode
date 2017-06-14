public class Solution 
{
    public int titleToNumber(String s)
    {
     s=s.toUpperCase();
     char ch[]=s.toCharArray();
     int i=s.length();
     int val=0;
     int j= s.length()-1;
     while(i!=0)
     {
         val=val+((int)(Math.pow(26,(s.length()-i)))*((int)(ch[j])-64));
         i--;j--;
     }
     return val;
        
    }
}

public class Solution 
{
    public String reverseString(String s) 
    {
        char ch[]=s.toCharArray();
        char temp;
        for(int i=0;i<s.length();i++)
        {
            temp=s.charAt(i);
            ch[i]=s.charAt(s.length()-1-i);
            ch[s.length()-1-i]=temp;
            
        }
        String str = new String(ch);
      return str;
    }
}

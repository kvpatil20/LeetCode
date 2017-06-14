public class Solution 
{
    public int firstUniqChar(String s) 
    {
        char ch[]=s.toCharArray();
        int indx=-1;
        outerloop:
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if((ch[i]==ch[j])&&(i!=j))
                break;
                else
                {
                    if(j!=s.length()-1)
                    continue;
                    else
                    {
                      indx=i;
                      break outerloop;
                    }
                }
            }
        }
        return indx;
    }
}

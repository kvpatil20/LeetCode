public class Solution
{
 public boolean isAnagram(String s, String t)
	    {
		    char s1[]= s.toCharArray();
		    char t1[]=t.toCharArray();
		    int a[]=new int[26];
		    int b[]=new int[26];
        
	        if(s.equals(t))
	        return true;
          
	        else if(s.length()!=t.length())
	        return false;
          
	        else
	        {
	            for(int i=0;i<s1.length;i++)
	            {
	                a[(int)s1[i]-97]++;
	                a[(int)t1[i]-97]--;
	            }
	        }
          
	        if(Arrays.equals(a,b))
	        return true;
	        else
	        return false;
	    }
}

public class Solution 
{
    public List<String> fizzBuzz(int n)
    {
        if(n<0)
        {
         n=0;  
        }
        List<String> str = new ArrayList<String>(n); 
        for(int i=1;i<=n;i++)
        {
            if((i%3)==0 && (i%5)==0)
            {
                str.add("FizzBuzz");
            }
            else if((i%5)==0)
            {
                str.add("Buzz");
            }
            else if((i%3)==0)
            {
                str.add("Fizz");
            }
            else
            {
                str.add(Integer.toString(i));
            }
        }
        return str;
    }
}

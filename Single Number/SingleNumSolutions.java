public class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int n=nums[0];
        try
        {
        Arrays.sort(nums);
        for(int i=0;i<(nums.length);i++)
        {
            if((i==0) && (nums[i]==nums[i+1]))
            continue;
            else if((i!=0 && i!=nums.length-1) && (nums[i]==nums[i+1] || nums[i]==nums[i-1]))
            continue;
            else if((i==nums.length-1) && (nums[i]==nums[i-1]))
            continue;
            else
            {
              n=nums[i];
              break;
            }
        }
        
        }
      
        catch(Exception e)
        {
            System.out.println(e);
        }
          return n;
    }
}

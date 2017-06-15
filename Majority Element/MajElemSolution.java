public class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int count=1;
        int no=0;
        Arrays.sort(nums);
        if(nums.length==1)
        return nums[0];
        else
        {
          for(int i=0;i<nums.length-1;i++)
          {
             if(nums[i]==nums[i+1])
            {
                count++;
                if(count>(nums.length/2))
              {
                no=nums[i];
                break;
              }
                
            }
             
           
            else
            {
                count=1;
            }
          }
        }
        return no;
        
    }
}

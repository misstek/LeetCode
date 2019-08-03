class Solution {
    public int[] twoSum(int[] nums, int target) { 
        int i = 0, j = 0;
        int[] result = {0,0};
        while(i<nums.length)
        {
            j = i + 1;
            while(j<nums.length)
            {
                if(nums[i]+nums[j] == target)
                {
                    result[0] = i;
                    result[1]= j;
                    break;
                }
                j = j+1;
            }
            i =i+1;
        }
        return result;
    }
}

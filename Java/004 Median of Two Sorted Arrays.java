class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int length1 = nums1.length;
        int length2 = nums2.length;
        int index = 0;
        int index1 = 0;
        int index2 = 0;
        int flag1 = 0;
        int flag2 = 0;
        int[] nums = new int[totalLength+10];
        if(length1 == 0)
        {
            nums = nums2;
        }
        else if(length2 == 0)
        {
            nums = nums1;
        }
        else{
        while(index < totalLength ){
           if(index1 != length1-1 && index2 != length2 -1){
                   if(nums1[index1]<nums2[index2])
                   {
                       nums[index] = nums1[index1];
                       index1++;
                       index++;
                   }
                   else{
                    nums[index] = nums2[index2];
                    index2++;
                    index++;
                   }
               }
            else if(index1 == length1-1 && index2 == length2 -1){
                if(nums1[index1]<nums2[index2]){
                    nums[index] = nums1[index1];
                    nums[index+1]=nums2[index2];
                }
                else{
                    nums[index] = nums2[index2];
                    nums[index+1]=nums1[index1];
                }
                if(totalLength%2 == 0){
            return (double)(nums[totalLength/2]+nums[totalLength/2-1])/2;
        }
        else{
            return (double) nums[totalLength/2];
        }
            }
               else if(index1 == length1-1){
                   if(nums1[index1]<nums2[index2] && flag1 == 0){
                       nums[index] = nums1[index1];
                       index++;
                       flag1 = 1;
                   }
                   else{
                       nums[index] = nums2[index2];
                       index++;
                       index2++;
                   }
               }
               else{
                       if(nums2[index2]<nums1[index1] && flag2 == 0){
                           nums[index] = nums2[index2];
                           index++;
                           flag2 = 1;
                           
                       }
                       else{
                           nums[index] = nums1[index1];
                           index++;
                           index1++;
                       }
            }
        }}
        if(totalLength%2 == 0){
            return (double)(nums[totalLength/2]+nums[totalLength/2-1])/2;
        }
        else{
            return (double) nums[totalLength/2];
        }
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sum = 0;
		int A[] = new int[127];
		int i;
        
		for(i=0 ; i<s.length() ; i++) {
			for(int j = 0; j < 127 ;j++) {
				A[j] = 0;
			}
			
			for(int j = i;j < s.length(); j++) {
				int index = s.charAt(j);
				if(A[index] != 0) {
					int tempsum = 0;
					for(int m = 0;m < 127;m++) {
						tempsum += A[m];
					}
					if(tempsum > sum) {
						sum = tempsum;
					}
					break;
				}
				else {
					A[index] += 1;
				}
			}
            int tempsum = 0;
		    for(int m = 0;m < 127;m++) {
		    	tempsum += A[m];
		    }
		    if(tempsum > sum) {
		    	sum = tempsum;
		    }
		}
		return sum;
    }
}

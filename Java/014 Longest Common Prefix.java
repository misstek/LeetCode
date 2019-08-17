class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        else if(strs.length == 1){
            return strs[0];
        }
        int minLen = strs[0].length();
        int lenFlag = 0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minLen){
                minLen = strs[i].length();
            }
        }
		//If there exist string[] like {"asds","qwe",""},just return string"".
        if(minLen == 0){
            return "";
        }
		//The purpose of the flag is to confirm that all strings are the same length.
        if(minLen == strs[0].length()){
            lenFlag = 1;
        }
		//Value of sum is to define the output chars.
        int sum = 0;
		//breakFlag is to confirm whether the loop breaks.
        int breakFlag = 0;
        bigLoop:for(int i=0;i<minLen;i++){
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i) == strs[0].charAt(i)){
                    breakFlag = 0;
                    sum = i;
                    continue;
                }
                else{
                    sum = i;
                    breakFlag = 1;
                    break bigLoop;
                }
            }
        }
		//If no break and all strings are the same length, then output the first string:strs[0].
        if(breakFlag == 0 && lenFlag == 1){
            return strs[0];
        }
		//If no break, then the length of output string should add 1.
        else if(breakFlag == 0){
            sum += 1;
        }
        StringBuilder str1 = new StringBuilder();
        for(int i=0;i<sum;i++){
            str1.append(strs[0].charAt(i));
        }
        String str2 = new String(str1);
        return str2;
    }
}

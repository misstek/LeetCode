class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        StringBuilder xToString = new StringBuilder();
        while(x!=0)
        {
            xToString.append(x%10);
            x = x/10;
        }
        for(int i=0;i<xToString.length()/2;i++){
            if(xToString.charAt(i)!=xToString.charAt(xToString.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public int myAtoi(String str) {
        if(str.equals(""))
            return 0;
        if(str.equals(" "))
            return 0;
        int overFlow = 0;
        int numFlag=0;
        int positiveFlag=0;
        int flag = 0;
        int error =0;
        StringBuilder str2 = new StringBuilder();
        str = str.trim();
        StringBuilder str1 = new StringBuilder(str);
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)<='9' && str1.charAt(i)>='0'){
                str2.append(str1.charAt(i));
                numFlag = 1;
            }
            else if(str.charAt(i) == '-'&& numFlag == 0 && flag == 0){
                positiveFlag = 1;
                flag =1;
            }
            else if(str.charAt(i) == '+'&& numFlag == 0 && flag == 0){
                positiveFlag = 0;
                flag = 1;
            }
            else if(numFlag == 0){
                error = 1;
                break;
            }
            else{
                break;
            }
        }
        if(error == 1)
            return 0;
        int sum = 0;
        if(str2.length()<=0)
            return 0;
        if(str2.charAt(0)<='9' && str2.charAt(0)>='0'){
            sum += (str2.charAt(0) - '0');
        }
        for(int i=1;i<str2.length();i++){
            int num = (str2.charAt(i)-'0');
            if(sum>Integer.MAX_VALUE/10 || (sum==Integer.MAX_VALUE/10 && num>7)){
                overFlow =1;
                break;
            }
            sum = sum*10;
            sum += str2.charAt(i)-'0';
        }
        if(overFlow == 1 && positiveFlag ==1)
            return -2147483648;
        if(overFlow == 1 && positiveFlag ==0)
            return 2147483647;
        if(sum == 0)
            return 0;
        if(positiveFlag == 1){
            sum = -sum;
        }
        return sum;
    }
}

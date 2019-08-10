class Solution {
    public int myAtoi(String str) {
        if(str.equals(""))
            return 0;
        if(str.equals(" "))
            return 0;
        int overFlow = 0;
        int numFlag=0;
        int positiveFlag=0;
        //flag作为符号为的作用是，防止出现“+-2”等不规范输入的出现
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
        //error的出现在"+-、数字"之前先出现了字母，因此是错误字符串，直接返回0
        if(error == 1)
            return 0;
        int sum = 0;
        //判断str2是否是空串
        if(str2.length()<=0)
            return 0;
        //若不为空，则先提取第一个元素数值，之后进行先乘10，再加下一位的迭代操作
        sum += (str2.charAt(0) - '0');
        for(int i=1;i<str2.length();i++){
            //判断是否在迭代计算数值的时候有溢出，若溢出，标记位置1，后退出
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

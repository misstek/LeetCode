class Solution {
    public String intToRoman(int num) {
        StringBuilder str1 = new StringBuilder();
        while(num!=0){
            if(num>=1000){
                str1.append("M");
                num -= 1000;
            }
            else if(num>=900){
                str1.append("CM");
                num -= 900;
            }
            else if(num>=500){
                str1.append("D");
                num -= 500;
            }
            else if(num>=400){
                str1.append("CD");
                num -= 400;
            }
            else if(num>=100){
                str1.append("C");
                num -= 100;
            }
            else if(num>=90){
                str1.append("XC");
                num -= 90;
            }
            else if(num>=50){
                str1.append("L");
                num -= 50;
            }
            else if(num>=40){
                str1.append("XL");
                num -= 40;
            }
            else if(num>=10){
                str1.append("X");
                num -= 10;
            }
            else if(num>=9){
                str1.append("IX");
                num -= 9;
            }
            else if(num>=5){
                str1.append("V");
                num -= 5;
            }
            else if(num>=4){
                str1.append("IV");
                num -= 4;
            }
            else if(num>=1){
                str1.append("I");
                num -= 1;
            }
        }
        String str2 = new String(str1);
        return str2;
    }
}

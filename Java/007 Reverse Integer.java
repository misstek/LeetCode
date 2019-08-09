class Solution {
    public int reverse(int x) {
        int sum = 0;
        int y = x;
        if(x >= 0){
            while(y!=0){            
                if(sum > Integer.MAX_VALUE/10)
                    return 0;
                sum = sum*10;
                sum += y%10;
                y = y/10;
            }
        }
        else{
            if(y == Integer.MIN_VALUE)
                return 0;
            y = -y;
            while(y!=0){            
                if(sum > Integer.MAX_VALUE/10)
                    return 0;
                sum = sum*10;
                sum += y%10;
                y = y/10;
            }
            sum = -sum;
        }
        return sum;
    }
}

# LeetCode
Create to record every line of LeetCode

## 001 Two Sum

> 8.3 60mins

- j = i +1，j的索引序列应该从i后面的开始数，不然会和i重复

## 002 Add Two Numbers

> 8.4 60mins

- java中没有指针，没有ListNode *L1的这种写法，也没有L1→next的这种写法，全都是L1.next

    /**
     * Definition for singly-linked list.
     **/
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
    }

- 创建新的类对象的时候，使用 new+参数，其中输入参数在类定义的时候已经定义好

    ListNode point = new ListNode(0);

- 写while循环的时候，考虑清楚do while和while用哪种，用while执行后是否还有“尾巴”没处理好，这时候就需要先执行一遍循环，再写while语句

## 003 Longest Substring Without Repeating Characters

> 8.5 60mins

- ASCII码一共126个，#48是0，#65是A，#97是a

    String s;
    s.chatAt(index) = "0";
    //用于取出字符串中的字符

    int A[] = new int[127];
    //创建arrays

## 004 Median of Two Sorted Arrays

> 8.6 180mins

## 007 Reverse Integer

> 8.9 30-40mins

- 题目很简单，但是要注意超出int范围的情况，以及int的正负范围

    if（num1>Integer.MAX_VALUE-num2)
        System.out.println("num1+num2上溢出");
    //Java加法中判断是否上溢

    while(y!=0){            
        if(sum > Integer.MAX_VALUE/10)
            return 0;
        sum = sum*10;
        sum += y%10;
        y = y/10;
    }
    //本题目中使用的每次✖️10的方法，所以需要sum数值与 Integer.MAX_VALUE/10 去比较

## 008 String to Integer(atoi)

> 8.10 60mins

- Str.charAt(i),这是在调用类中的方法，而不是Str.charAt[i]像数组一样使用，后者是错误写法

## 009 Palindrome Number

> 8.11 20mins

- 跟008犯的错误一样，使用Str.charAt[i]在调用字符串，而且还把charAt写成了chatAt了

## 013 Roman to Integer

> 8.12 15mins

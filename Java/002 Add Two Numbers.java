/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode point = new ListNode(0);
        result.next = point;
        int carry = 0;
        int temp = 0;
        
        if(l1 != null && l2 == null){
                temp = l1.val + carry;
                point.val = temp%10;
                carry = temp/10;
                temp = 0;
                
                l1 = l1.next;
            }
            else if(l1 == null && l2 != null){
                temp = l2.val + carry;
                point.val = temp%10;
                carry = temp/10;
                temp = 0;
               
                l2 = l2.next;
            }
            else if(l1 != null && l2 != null){
                temp = l1.val + l2.val + carry;
                point.val = temp%10;
                carry = temp/10;
                temp = 0;
               
                l1 = l1.next;
                l2 = l2.next;
            }
        
        while(l1 != null || l2 != null || carry == 1){
            if(l1 == null && l2 == null && carry == 0){
                break;
                
            } 
            else if(l1 != null && l2 == null){
                temp = l1.val + carry;
                
                ListNode node = new ListNode(0);
                point.next = node;
                point = point.next;
                
                point.val = temp%10;
                carry = temp/10;
                temp = 0;
                
                l1 = l1.next;
            }
            else if(l1 == null && l2 != null){
                temp = l2.val + carry;
                
                ListNode node = new ListNode(0);
                point.next = node;
                point = point.next;
                
                point.val = temp%10;
                carry = temp/10;
                temp = 0;
               
                l2 = l2.next;
            }
            else if(l1 != null && l2 != null){
                temp = l1.val + l2.val + carry;
                
                ListNode node = new ListNode(0);
                point.next = node;
                point = point.next;
                
                point.val = temp%10;
                carry = temp/10;
                temp = 0;
                
                l1 = l1.next;
                l2 = l2.next;
            }
            else{
                ListNode node = new ListNode(0);
                point.next = node;
                point = point.next;
                
                point.val = 1;
                carry = 0;
            }
        }
        return result.next;
    }
}

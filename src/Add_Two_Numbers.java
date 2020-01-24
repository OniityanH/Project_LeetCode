
  //Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode l3;
        int carry = 0;
        while(true){
            if (l1.next != null){
                l3 = new ListNode((l1.val + l2.val + carry)%10);
                if (l1.val + l2.val >= 10){
                    carry = 1;
                }
                else{
                    carry = 0;
                }
            }
            else{
                return l3;
            }
        }
    }
}
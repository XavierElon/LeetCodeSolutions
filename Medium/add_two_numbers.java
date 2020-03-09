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
        // Do not need to check for empty lists
        
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode l3 = head;
        
        // Loop through until both lists are empty
        while (l1 != null || l2 != null) {
            // Use ternary operators to extract the values and set equal to zero if list is empty
            int l1_value = (l1 != null) ? l1.val : 0;
            int l2_value = (l2 != null) ? l2.val :0;
            
            int sum = l1_value + l2_value + carry;
            
            // Extract the number to be stored in the list with mod operator and check if carry by dividing by 10
            int number = sum % 10;
            carry = sum / 10;
            
            // Store the number variable in the new list
            ListNode node = new ListNode(number);
            l3.next = node;
            
            // Point to next node in new list
            l3 = l3.next;
            
            // If lists are not empty move to next node
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        // If last digit has a carry we need to create a new node (an extra digit)
        if (carry > 0) {
            // The only case is it can be 1 i.e. 999+999 =  1998 (the 1 in front)
            ListNode node = new ListNode(1);
            l3.next = node;
        }
        return head.next;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode current = head;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                ListNode temp = list1.next;
                current.next = list1;
                list1 = temp;
            }else {
                ListNode temp = list2.next;
                current.next = list2;
                list2 = temp;
            }
            current = current.next;
        }
        while(list1 != null){
            current.next = list1;
            current = current.next;
            list1 = list1.next;
        }
         while(list2 != null){
            current.next = list2;
            current = current.next;
            list2 = list2.next;
        }
        return head.next;
    }
}
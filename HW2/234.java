/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        int p1, p2, n;//指针p1, p2; n为链表长度
        p1 = 0;
        n = 0;
        if(head == null || head.next == null) return true;
        if((head.next).next == null ){
            if(head.val == (head.next).val) return true;
            else return false;
        }
        boolean pal = false; //是否为回文
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }//得出有多少个元素
        //1 2 3 4 23   1 2 3 4 5 24 n/2 (n+3)/2
        int len = n/2;
        ListNode head2 = head;
        for(int i = 1; i< (n+3)/2; i++){
            head2 = head2.next;
        }//得到第二个子串的头
        ListNode newHead = reverse(head2);//翻转第二个子串,返回第二个子串的头
        ListNode pointer1 = head;
        ListNode pointer2 = newHead;
        for(int i=0; i<len; i++){
            if(pointer1.val != pointer2.val) return false;
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head2){
        ListNode prev = null;
        ListNode _next = head2;
        ListNode pointer = head2;
        while(_next != null){
            _next = pointer.next;
            pointer.next = prev;
            prev = pointer;
            pointer = _next;
        }
        return prev;
    }
}
package DSA;

public class pallindrome {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode nextN = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextN;
        }
        return prev;
    }
    public ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(ListNode head){
        ListNode middle = findMiddle(head);
        ListNode secondFirst = reverse(middle.next);
        ListNode firstHalf = head;

        while(secondFirst != null){
            if(firstHalf.val != secondFirst.val){
                return false;
            }
            secondFirst = secondFirst.next;
            firstHalf = firstHalf.next;
        }
        return true;
    }
}

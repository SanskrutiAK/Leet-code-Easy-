import java.util.ArrayList;
import java.util.List;

public class LinkedListPalindrome {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
      }
      public boolean isPalindrome(ListNode head) {
        boolean ans = true;
        List palindrome = new ArrayList<>();
        ListNode startptr = head;
        int listLength = 0;
        while(startptr!=null){
            listLength++;
            startptr=startptr.next;
        }
        startptr = head;
        int traversPt = listLength/2;
        for( int i =0;i< traversPt;i++){
            palindrome.add(startptr.val);
            startptr=startptr.next;
        }
        if(listLength%2!=0){
            startptr=startptr.next;
        }
        int check = traversPt-1;
        while (startptr!=null){
            if (startptr.val!=(Integer) palindrome.get(check)){
                return false;
            }
            if(traversPt> 0)
                check--;
            startptr =startptr.next;
        }
        return ans;
      }
    public static void main(String args[]){
        ListNode l1n1 = new ListNode(2);
        ListNode l1n2 = new ListNode(3);
        ListNode l1n3 = new ListNode(4);
        ListNode l1mn = new ListNode(4);
        ListNode l2n1 = new ListNode(4);
        ListNode l2n2 = new ListNode(3);
        ListNode l2n3 = new ListNode(2);

        l1n1.next=l1n2;
        l1n2.next =l1n3;
        l1n3.next =l1mn;
        l1mn.next =l2n1;
        l2n1.next = l2n2;
        l2n2.next = l2n3;

        LinkedListPalindrome llp = new LinkedListPalindrome();
        System.out.println(llp.isPalindrome(l1n1));


    }
}

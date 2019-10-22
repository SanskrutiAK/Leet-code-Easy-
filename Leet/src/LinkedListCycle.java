import java.util.HashSet;

public class LinkedListCycle {

//    Definition for singly-linked list.
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public boolean hasCycle(ListNode head) {
          HashSet<ListNode> set = new HashSet<>();
          while(head!= null){
              if(set.contains(head))
                  return true;
              set.add(head);
              head= head.next;
          }
          return false;
    }
    public static void main(String[] args) {

    }
}

public class DeleteLLNode {
    static ListNode  head ;
      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public void deleteNode(ListNode node) {
          ListNode curnode = node;
          curnode.val = curnode.next.val;
          curnode.next = curnode.next.next;
    }
    public static void main(String[] args) {
          head = new ListNode(4);
          ListNode n2 = new ListNode(5);
          ListNode n3 = new ListNode(1);
          ListNode n4 = new ListNode(9);
//          ListNode n5 = new ListNode(3);
//          ListNode n6 = new ListNode(3);
//          ListNode n7 = new ListNode(3);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        DeleteLLNode dlln = new DeleteLLNode();
        dlln.deleteNode(n3);
        ListNode node = head;
        while(node!=null){
            System.out.print(node.val);
            node=node.next;
        }

    }
}

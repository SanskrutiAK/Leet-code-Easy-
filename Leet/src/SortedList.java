public class SortedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l1head = l1;
        ListNode l2head = l2;
        ListNode pivot = null;
        ListNode tempPivot = null;
        ListNode startList = null;
        ListNode headList = null;
        pivot = l1.val > l2.val ? l1 : l2;
        startList = l1.val < l2.val ? l1 : l2;
        headList = startList;
        if(l1!=null&&l2!=null)
        do{
            if(startList.next==null){
                startList.next = pivot;
                return headList;
            }

            while (startList.next.val < pivot.val) {
                startList = startList.next;
            }
            tempPivot = startList.next;
            startList.next = pivot;
            pivot = tempPivot;
            startList = startList.next;
            ListNode ans = headList;
            while (ans != null) {
                System.out.print(ans.val);
                ans = ans.next;
            }
            System.out.println();
        }while(startList.next!=null||pivot.next!=null);
        else{
            return null;
        }

        return headList;
    }



    public static void main(String args[]){

          ListNode l1 = new ListNode(1);
//          ListNode l11 = new ListNode(2);
//          ListNode l12 = new ListNode(4);
//          l1.next=l11;
//          l11.next=l12;

          ListNode l2 = new ListNode(3);
//          ListNode l21 = new ListNode(5);
//          ListNode l22 = new ListNode(7);
//          l2.next=l21;
//          l21.next=l22;

          SortedList sl = new SortedList();
          ListNode ans = null;
          ans = sl.mergeTwoLists(null,null);
          if(ans!=null)
          while(ans!=null){
              System.out.print(ans.val);
              ans=ans.next;
          }

    }
}

public class MergeTwoList {
    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head;
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1 == null && l2 == null){
            return null;
        }
        if(l2.val<l1.val) {
            head = new ListNode(l2.val);
            l2 = l2.next;
        }
        else {
            head = new ListNode(l1.val);
            l1 = l1.next;
        }
        ListNode ans = head;
        while((l1!= null) || (l2!=null)){
            if((l1 == null)&&(l2!=null)){
                while(l2!=null){
                    ans.next = l2;
                    l2= l2.next;
                    ans = ans.next;
                }
                break;
            }
            if((l1 != null)&&(l2==null)){
                while(l1!=null){
                    ans.next = l1;
                    l1= l1.next;
                    ans = ans.next;
                }
                break;
            }
            if(l2.val<l1.val){
                ans.next = l2;
                l2= l2.next;
                ans = ans.next;
            }
            else {
                ans.next =l1;
                l1= l1.next;
                ans = ans.next;
            }

        }
        return head;
    }
    public static void main(String[] args) {

        ListNode l1n1 = new ListNode(1);
        ListNode l1n2 = new ListNode(2);
        ListNode l1n3 = new ListNode(4);

        l1n1.next = l1n2;
        l1n2.next = l1n3;


        ListNode l2n1 = new ListNode(1);
        ListNode l2n2 = new ListNode(3);
        ListNode l2n3 = new ListNode(4);

        l2n1.next = l2n2;
        l2n2.next = l2n3;

        MergeTwoList mtl = new MergeTwoList();
        ListNode ans = mtl.mergeTwoLists(null,l2n1);

        while(ans != null){
            System.out.println(ans.val);
            ans= ans.next;
        }
    }
}

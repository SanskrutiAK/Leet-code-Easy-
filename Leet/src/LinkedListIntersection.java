public class LinkedListIntersection {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listA = headA;
        ListNode listB = headB;
        ListNode intersection;
        int listALength = 0;
        int listBLength = 0;

        while(headA!= null){
            listALength++;
            listA = listA.next;
        }
        while(headB!= null){
            listBLength++;
            listB = listB.next;
        }

        if(listALength>listBLength){
            int diff = listALength-listBLength;
            intersection = headA;
            while(diff>=0){
                intersection = intersection.next;
                diff --;
            }
        }
        else{
            int diff = listBLength-listALength;
            intersection = headB;
            while(diff>=0){
                intersection = intersection.next;
                diff --;
            }
        }
        return intersection;
    }
    public static void main(String[] args) {
        LinkedListIntersection lli = new LinkedListIntersection();

        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(9);
        ListNode n5 = new ListNode(3);
        ListNode n6 = new ListNode(3);
        ListNode n7 = new ListNode(3);

        n2.next = n3;
        n3.next = n4;
    }
}

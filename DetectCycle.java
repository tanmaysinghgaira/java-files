public class DetectCycle {
    static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        a.next.next.next = a.next; // cycle
        System.out.println(hasCycle(a)); // true
    }
}

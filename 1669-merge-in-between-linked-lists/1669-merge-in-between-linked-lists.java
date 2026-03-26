class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevA = list1;
        // Move to node just before 'a'
        for (int i = 1; i < a; i++) {
            prevA = prevA.next;
        }

        ListNode afterB = prevA;
        // Move to node just after 'b'
        for (int i = a; i <= b; i++) {
            afterB = afterB.next;
        }

        // Connect prevA to list2
        prevA.next = list2;

        // Find tail of list2
        ListNode tail = list2;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Connect tail of list2 to afterB
        tail.next = afterB.next;

        return list1;
    }
}
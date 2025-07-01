/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class AddTwoNumbersSolution {

    // AddTwoNumbers method
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // separate dummy node to start result
        ListNode curr = dummy;
        ListNode p = l1, q = l2;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10); // store the digit
            curr = curr.next;

            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        // if carry remains, create new node
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }


    // Print linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        AddTwoNumbersSolution sol = new AddTwoNumbersSolution();

        // l1 = 2 -> 4 -> 3
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // l2 = 5 -> 6 -> 4
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        // Display input
        System.out.print("List 1: ");
        sol.printList(l1);

        System.out.print("List 2: ");
        sol.printList(l2);

        // Add and print result
        ListNode result = sol.addTwoNumbers(l1, l2);
        System.out.print("Result: ");
        sol.printList(result); // Expected Output: 7 -> 0 -> 8
    }

    // Inner ListNode class for local testing (if not using LeetCode)
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}

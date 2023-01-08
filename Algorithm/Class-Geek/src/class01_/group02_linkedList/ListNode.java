package class01_.group02_linkedList;

/**
 * @Author: ajie
 * @Date: 2023/1/8
 */
public class ListNode {
    int val;

    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

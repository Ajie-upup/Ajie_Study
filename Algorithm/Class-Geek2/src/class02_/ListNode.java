package class02_;

/**
 * @Author: ajie
 * @Date: 2023/2/12
 * @Description: ListNode 单链表
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

package class02_;

/**
 * @Author: ajie
 * @Date: 2023/2/13
 * @Description: https://leetcode.cn/problems/linked-list-cycle-ii/
 */
public class code08_环形链表2 {
    /**
     * 返回第一个入环节点
     *
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                //第一次 slow 和 fast 相遇证明链表有环
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}

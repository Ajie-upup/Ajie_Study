package class02_链表;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: ajie
 * @Date: 2023/2/13
 * @Description: https://leetcode.cn/problems/linked-list-cycle/description/
 */
public class code07_环形链表 {
    /**
     * 遍历节点，利用一个哈希表存储遍历过的节点
     *
     * @param head
     * @return
     */
    public boolean hasCycle1(ListNode head) {
        Set<ListNode> used = new HashSet<ListNode>();
        while (head != null) {
            if (!used.add(head)) {
                //如果存在相同节点，证明有环
                return true;
            }
            head = head.next;
        }
        return false;
    }

    /**
     * 通过快慢指针遍历链表，快慢指针相遇证明有环
     *
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}

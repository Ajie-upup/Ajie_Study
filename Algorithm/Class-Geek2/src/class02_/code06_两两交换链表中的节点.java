package class02_;

/**
 * @Author: ajie
 * @Date: 2023/2/12
 * @Description: https://leetcode.cn/problems/swap-nodes-in-pairs/
 */
public class code06_两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        //temp 始终是 需要移动的元素的前一个元素
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null) {
            ListNode first = temp.next;
            ListNode second = first.next;

            temp.next = second;
            first.next = second.next;
            second.next = first;
            temp = first;

        }
        return pre.next;
    }
}

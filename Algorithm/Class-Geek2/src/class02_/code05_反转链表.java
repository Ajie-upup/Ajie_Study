package class02_;

/**
 * @Author: ajie
 * @Date: 2023/2/12
 * @Description: https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class code05_反转链表 {

    public ListNode swapPairs(ListNode head) {
        ListNode last = null;
        while (head != null) {
            //记录头节点的下一个节点
            ListNode nextHead = head.next;
            head.next = last;
            // last, head 向后移动一位
            last = head;
            head = nextHead;
        }
        return last;
    }
}

package class01_.group02_linkedList;

/**
 * 反转链表
 * https://leetcode.cn/problems/reverse-linked-list/
 *
 * @Author: ajie
 * @Date: 2023/1/8
 */
public class code01_ {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode last = null;
        while (head != null) {
            ListNode nextHead = head.next;
            // 改一条边
            head.next = last;
            // last, head向后移动一位
            last = head;
            head = nextHead;
        }
        return last;
    }
}

package class02_链表;

/**
 * @Author: ajie
 * @Date: 2023/2/13
 * @Description: https://leetcode.cn/problems/reverse-nodes-in-k-group/
 */
public class code09_K个一组翻转链表 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;

        while (end.next != null) {
            //判断 end 是否合法
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }
            //记录需要翻转的链表的首位节点
            ListNode start = pre.next;
            //记录翻转链表区域的下一个节点，以便翻转链表之后合并链表
            ListNode next = end.next;

            //断开 k 个一组的链表
            end.next = null;
            //翻转链表，并合并已经翻转的链表部分
            pre.next = reverse(start);
            //翻转后的链表的最后一个元素是 start，合并未翻转链表的部分
            start.next = next;
            //重置pre 和 end 节点
            pre = start;
            end = pre;
        }
        return dummy.next;
    }

    /**
     * 翻转链表
     *
     * @param head
     * @return
     */
    public ListNode reverse(ListNode head) {
        ListNode last = null;
        while (head != null) {
            ListNode nextHead = head.next;
            head.next = last;
            last = head;
            head = nextHead;
        }
        return last;
    }
}

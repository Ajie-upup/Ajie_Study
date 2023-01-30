package part01_;

/**
 * @Author: ajie
 * @Date: 2023/1/30
 * @Description: 合并两个链表
 * https://leetcode.cn/problems/merge-in-between-linked-lists/
 */
public class Day04_ {
    public static void main(String[] args) {

    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode cur = list1;
        for (int i = 1; i < a; i++) {
            cur = cur.next;
        }
        ListNode end = cur;
        for (int i = a; i <= b; i++) {
            end = end.next;
        }
        cur.next = list2;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = end.next;
        return list1;
    }
}

package link2;

/**
 * @author: fanbopeng
 * @Date: 2019/3/5 11:05
 * @Description:输入一个链表，输出该链表中倒数第k个结点。
 */


public class linkK {

    public ListNode FindKthToTail(ListNode head, int k) {

        if (head == null || k <= 0) {

            return null;
        }
        ListNode old = head;

        int count = 1;
        while (head.next != null) {

            head = head.next;
            count++;


        }

        if (k > count) {


            return null;
        }

        for (int i = 0; i < count - k; i++) {

            old = old.next;

        }

        return old;

    }


}

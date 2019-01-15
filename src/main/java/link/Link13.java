package link;

/**
 * @author: fanbopeng
 * @Date: 2019/1/14 14:38
 * @Description:输入一个链表，输出该链表中倒数第k个结点。
 *
 *
 * 思路:先统计 链表的长度
 *   链表的长度减去 倒数的K就是需要的节点
 *
 *
 */




public class Link13 {



    public static   ListNode FindKthToTail(ListNode head,int k) {
        if (head==null||k<0){

            return null;
        }
            int count=1;

        ListNode old=head;

        while (head.next!=null){
            head=head.next;
            count++;
        }
        if(k>count){

            return null;
        }
        for (int i=0;i<count-k;i++){

            old=old.next;


        }

        return old;

    }








    class ListNode {

        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }

    }

}


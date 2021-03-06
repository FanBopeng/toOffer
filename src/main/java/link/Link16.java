package link;

/**
 * @author: fanbopeng
 * @Date: 2019/1/14 20:33
 * @Description:输入一个链表，反转链表后，输出新链表的表头。
 */



public class Link16 {

    public Link57.ListNode ReverseList(Link57.ListNode head) {

        if (head == null) {
            //head为当前节点，如果当前节点为空的话，那就什么也不做，直接返回null；
            return null;
        }


        //当前节点是head，pre为当前节点的前一节点，next为当前节点的下一节点
        //需要pre和next的目的是让当前节点从pre->head->next1->next2变成pre<-head next1->next2
        //即pre让节点可以反转所指方向，但反转之后如果不用next节点保存next1节点的话，此单链表就此断开了
        //所以需要用到pre和next两个节点
        //1->2->3->4->5
        //1<-2<-3 4->5
        Link57.ListNode cur = null;
        Link57.ListNode pre = null;
        while (head != null) {


            //做循环，如果当前节点不为空的话，始终执行此循环，此循环的目的就是让当前节点从指向next到指向pre
            //如此就可以做到反转链表的效果
            //先用next保存head的下一个节点的信息，保证单链表不会因为失去head节点的原next节点而就此断
            cur = head.next;
            //保存完next，就可以让head从指向next变成指向pre了，代码如下
            head.next = pre;
//如果head为null的时候，pre就为最后一个节点了，但是链表已经反转完毕，pre就是反转后链表的第一个节点
            //直接输出pre就是我们想要得到的反转后的链表
            pre = head;
            head = cur;

        }

        return pre;


    }


}

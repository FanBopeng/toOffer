package link;

import java.util.HashMap;

/**
 * @author: fanbopeng
 * @Date: 2019/1/14 21:26
 * @Description:输入两个链表，找出它们的第一个公共结点。
 */
public class Link37 {


    public Link57.ListNode FindFirstCommonNode(Link57.ListNode pHead1, Link57.ListNode pHead2){
        Link57.ListNode cur1=pHead1;
        Link57.ListNode cur2=pHead2;

        HashMap<Link57.ListNode,Integer> map=new HashMap<>();
        while (cur1!=null){

            map.put(cur1,null );
            cur1=cur1.next;

        }
        while (cur2!=null){
        if (map.containsKey(cur2)){

            return  cur2;

        }
            cur2=cur2.next;
        }


            return null;


    }
}

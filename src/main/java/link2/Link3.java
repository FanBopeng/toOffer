package link2;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @author: fanbopeng
 * @Date: 2019/3/4 14:36
 * @Description:  从尾到头打印链表
 */

 class ListNode {
       int val;
       ListNode next = null;

        ListNode(int val) {
             this.val = val;
         }
    }



public class Link3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        Stack<Integer>  temp=new Stack<>();
        ArrayList<Integer> newList=new ArrayList<>();
        ListNode node=listNode;
        while (node!=null){

            temp.push(node.val);
            node=node.next;

        }
        while (!temp.isEmpty()){

            newList.add(temp.pop());

        }
        return newList;




    }
}

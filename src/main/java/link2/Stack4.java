package link2;

import java.util.Stack;

/**
 * @author: fanbopeng
 * @Date: 2019/3/4 15:11
 * @Description:
 */
public class Stack4 {

    Stack<Integer> stackPush= new Stack<Integer>();
    Stack<Integer> stackPop = new Stack<Integer>();

    public void push(int node) {

        stackPush.push(node);

    }

    public int pop() {
        if (stackPush.empty()&&stackPop.empty()){
            throw  new RuntimeException("Queue is empty");

        }else if (stackPop.empty()){
            while (!stackPush.empty()){

                stackPop.push(stackPush.pop());

            }


        }
        return stackPop.pop();

    }

}

package org.cai.work925;

import java.util.Stack;

/**
 * @author cai584770
 * @date 2024/9/25 12:50
 * @Version
 * 程序员代码面试指南 使用栈实现队列
 */
public class Stack2Sequence {
    private Stack<Integer> stackPop;
    private Stack<Integer> stackPush;

    public Stack2Sequence(){
        this.stackPop = new Stack<Integer>();
        this.stackPush = new Stack<Integer>();
    }

    private void pushToPop(){
        if (stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
    }

    public void add(int pushInt){
        stackPush.push(pushInt);
        pushToPop();
    }

    public int poll(){
        if (stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("Queue is empty!");
        }

        pushToPop();

        return stackPop.pop();
    }

    public int peek(){
        if (stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("Queue is empty!");
        }

        pushToPop();
        return stackPop.peek();
    }


}

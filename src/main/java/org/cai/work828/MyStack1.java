package org.cai.work828;

import java.util.Stack;

/**
 * @author cai584770
 * @date 2024/8/28 13:23
 * @Version
 */
public class MyStack1 {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyStack1() {
        this.stack1 = new Stack<Integer>();
        this.stack2 = new Stack<Integer>();
    }

    public int getMin() {
        if (this.stack2.isEmpty()) {
            throw new RuntimeException("min stack is empty!");
        }

        return this.stack2.peek();
    }

    public void push(int newNum) {
        if (this.stack2.isEmpty()) {
            this.stack2.push(newNum);
        } else if (this.getMin() >= newNum) {
            this.stack2.push(newNum);
        }

        this.stack1.push(newNum);
    }

    public int pop() {
        if (this.stack1.isEmpty()) {
            throw new RuntimeException("data is empty!");
        }

        int value = this.stack1.pop();
        if (value == this.getMin()) {
            this.stack2.pop();
        }
        return value;
    }


}

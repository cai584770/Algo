package org.cai.work925;

import java.util.Stack;

/**
 * @author cai584770
 * @date 2024/9/25 13:02
 * @Version
 * 使用递归逆序栈
 */
public class ConvertStack {

    public static int getAndRemoveLastElement(Stack<Integer> stack){
         int result = stack.pop();
         if(stack.isEmpty()){
             return result;
         }else {
             int last = getAndRemoveLastElement(stack);
             stack.push(result);
             return last;
        }
    }

    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }

        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

}

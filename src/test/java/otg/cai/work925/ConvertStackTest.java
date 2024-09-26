package otg.cai.work925;

import org.cai.work925.ConvertStack;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author cai584770
 * @date 2024/9/25 13:07
 * @Version
 */
public class ConvertStackTest {

    @Test
    public void test(){
        Stack<Integer> s1 = new Stack<Integer>();
        s1.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(s1);
        ConvertStack.reverse(s1);
        System.out.println(s1);
    }

    @Test
    public void test1(){

    }
}

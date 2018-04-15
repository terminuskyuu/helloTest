/**
 * Created by xinyu on 2018/1/25.
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class Hello2Test {
    private Hello h=new Hello();

    @Test
    public void test1(){
        assertTrue(h.sayHello(0).equals("hello"));
        assertTrue(h.sayHello(1).equals("HE"));
    }


}

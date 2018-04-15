/**
 * Created by xinyu on 2018/1/25.
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class Hello3Test {
    private Hello h=new Hello();

    @Test
    public void test1(){
        assertEquals(h.sayHello(0),"hellol");
    }


}

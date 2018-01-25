/**
 * Created by xinyu on 2018/1/25.
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
public class HelloTest {
    private Hello h=new Hello();

    @Test
    public void test1(){
        assertTrue(h.sayHello(0).equals("hello"));
        assertTrue(h.sayHello(1).equals("HELLO"));
    }


}

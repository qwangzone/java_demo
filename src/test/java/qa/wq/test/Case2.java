package qa.wq.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Case2 {
    @Test
    public void wq(){
        System.out.println("=============testcase2");
        Assert.assertEquals(1+1,2);
    }
}

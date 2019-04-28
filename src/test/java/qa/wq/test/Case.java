package qa.wq.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Case {
    Logger log = Logger.getLogger(Case.class);

    @Test
    public void wq(){
        System.out.println("=============testcase1");
        log.info("==========");
        Assert.assertEquals(1+1,2);
        log.info("测试结束");
    }
}

package qa.wq.test;

import org.testng.*;
import org.testng.log4testng.Logger;

public class RetryTest implements IRetryAnalyzer {
    private static Logger logger = Logger.getLogger(RetryTest.class);
    private static int maxRetryCount = 3;
    private int retryCount = 1;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount<maxRetryCount){
            String message = "Running retry for '" +result.getName()+
                    "' on class" + this.getClass().getName()+"Retrying "+
                    retryCount + "times";
            logger.info(message);
            System.out.println(message);
            Reporter.setCurrentTestResult(result);
            Reporter.log("RunCount="+(retryCount+1));
            retryCount++;
            return true;
        }
        return false;
    }
}

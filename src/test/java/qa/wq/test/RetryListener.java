package qa.wq.test;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListener implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation iTestAnnotation,
                          Class aClass, Constructor constructor,
                          Method method) {
        IRetryAnalyzer retry = iTestAnnotation.getRetryAnalyzer();

        //            iTestAnnotation.setRetryAnalyzer(RetryTest.class);
        if (retry==null) {
            System.out.println(retry+"=========");
            iTestAnnotation.setRetryAnalyzer(RetryTest.class);
        }


    }
}

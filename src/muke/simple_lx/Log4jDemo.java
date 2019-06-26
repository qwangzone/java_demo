package muke.simple_lx;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import sun.rmi.runtime.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Log4jDemo {
    public static void main(String[] args) throws IOException {

        Properties log4j = new Properties();
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("resources/log4j.properties");
        log4j.load(inputStream);
        PropertyConfigurator.configure(log4j);
        Logger log = Logger.getLogger(Log4jDemo.class);
        log.info("22222233333");
        log.error("ppppppppp");
        log.info("ddddddd");
        //log.info(log4j.getProperty("log4j.appender.CONSOLE"));


    }

}

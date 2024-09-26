package com;

import com.pratik.Course;
import lombok.SneakyThrows;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    @SneakyThrows
    public static void main(String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Course course = context.getBean("courseReference", Course.class);
        logger.info("Retrieved Course: {}", course);
    }
}

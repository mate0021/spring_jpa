package com.guitar.db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by mate00 on 2016-04-19.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/app-context.xml");
        Magic m = (Magic) context.getBean("test.prod.magic");
//        m.doSth();
    }
}

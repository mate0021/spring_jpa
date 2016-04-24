package com.guitar.db;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import org.springframework.beans.factory.InitializingBean;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by mate00 on 2016-04-19.
 */
public class SomeBean implements InitializingBean {
    private final String str;

    public SomeBean(String str) {
        this.str = str;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after props set");
        try {
            throw new IllegalArgumentException("illegal argument MITCH!");
        } catch (Exception e) {
            System.out.println("some exc was thrown");
        }
    }

    public void init() {
        System.out.println("init");
    }

    public void provide() {
        System.out.println("providing...");
        try {
//            init();

            InputStream is = new ByteInputStream();
            is.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

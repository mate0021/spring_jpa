package com.guitar.db;

/**
 * Created by mate00 on 2016-04-19.
 */
public class Magic {

    private SomeBean sb;

    public void doSth() {
//        String str = "asdf";
//        SomeBean sb = new SomeBean(str);
        sb.provide();
    }

    public void setSb(SomeBean sb) {
        this.sb = sb;
    }
}

package com.superlilu.utils;

import com.superlilu.dao.AbstractDisplay;

public class StringDisplay extends AbstractDisplay {
    private String s;

    public StringDisplay(String s) {
        this.s = s;
    }

    @Override
    public void open() {
        System.out.println("=================");
        System.out.println("It's String Display now start");
    }

    @Override
    public void print() {
        System.out.println("now print String:" + s);
    }

    @Override
    public void close() {
        System.out.println("It has over now");
        System.out.println("=================");
    }
}

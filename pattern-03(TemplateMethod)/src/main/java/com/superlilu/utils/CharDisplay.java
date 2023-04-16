package com.superlilu.utils;

import com.superlilu.dao.AbstractDisplay;

public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.println("open Display It has been started");
    }

    @Override
    public void print() {
        System.out.println("now print char:"+ch);
    }

    @Override
    public void close() {
        System.out.println("now close display,It is over now");
    }
}

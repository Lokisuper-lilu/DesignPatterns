package com.superlilu.pojo;

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    //(String)
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    //*String*
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}

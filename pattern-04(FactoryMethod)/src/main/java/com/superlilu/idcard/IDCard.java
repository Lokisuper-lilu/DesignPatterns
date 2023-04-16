package com.superlilu.idcard;

import com.superlilu.framework.Product;

@SuppressWarnings("unused")
public class IDCard extends Product {
    private final String owner;

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public IDCard(String owner) {
        System.out.println("制作一张ID卡，主人为:" + owner);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
}

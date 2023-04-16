package com.superlilu.dao;

public interface Iterator {
    // 迭代器函数
    // 1. 是否有下一个元素
    boolean hasNext();

    //  2. 获取下一个元素
    Object next();
}

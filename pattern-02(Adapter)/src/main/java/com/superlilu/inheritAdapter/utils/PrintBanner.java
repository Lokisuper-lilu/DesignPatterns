package com.superlilu.inheritAdapter.utils;

import com.superlilu.inheritAdapter.dao.Print;
import com.superlilu.pojo.Banner;

@SuppressWarnings("unused")
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}

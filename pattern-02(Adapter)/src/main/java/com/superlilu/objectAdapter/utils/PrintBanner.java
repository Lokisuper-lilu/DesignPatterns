package com.superlilu.objectAdapter.utils;

import com.superlilu.objectAdapter.dao.Print;
import com.superlilu.pojo.Banner;

@SuppressWarnings("unused")
public class PrintBanner extends Print {
    private final Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}

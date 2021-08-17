package com.csy.design.proxy;

import java.net.URL;

/**
 * <p>Description：</p>
 *
 * @author shuyun.cheng
 * @date 2021/8/17 17:09
 */
public class HighResolutionImage implements Image {
    private URL imageUrl;
    private long startTime;
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public HighResolutionImage(URL imageUrl) {
        this.imageUrl = imageUrl;
        this.startTime = System.currentTimeMillis();
        this.width = 600;
        this.height = 600;
    }

    public boolean isLoaded() {
        // 模拟图片加载，延迟 3s 加载完成
        long endTime = System.currentTimeMillis();
        return endTime - startTime > 3000;
    }

    @Override
    public void showImage() {
        System.out.println("Real Image: " + imageUrl);
    }
}

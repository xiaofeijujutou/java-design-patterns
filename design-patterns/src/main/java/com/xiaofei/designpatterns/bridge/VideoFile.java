package com.xiaofei.designpatterns.bridge;

/**
 * @Description: Created by IntelliJ IDEA.
 * 视频文件
 * @Author : 小肥居居头
 * @create 2024/3/10 18:47
 */


public interface VideoFile {
    /**
     * 视频文件的解码操作
     * @param fileName 文件
     * @return 解码的数据;
     */
    String decode(String fileName);
}

package com.xiaofei.designpatterns.bridge;

/**
 * @Description: Created by IntelliJ IDEA.
 * 操作系统抽象类;
 * @Author : 小肥居居头
 * @create 2024/3/10 18:51
 */


public abstract class OpratingSystem {
    //聚合视频文件
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void playVideo(String fileName);
}

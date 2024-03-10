package com.xiaofei.designpatterns.bridge;

/**
 * @Description: Created by IntelliJ IDEA.
 * 拓展抽象化角色
 * @Author : 小肥居居头
 * @create 2024/3/10 18:53
 */


public class WindowsSystem extends OpratingSystem {
    public WindowsSystem(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void playVideo(String fileName) {
        String decode = videoFile.decode(fileName);
        System.out.println("Windows播放视频: " + decode);
    }
}

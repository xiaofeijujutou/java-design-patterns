package com.xiaofei.designpatterns.bridge;

/**
 * @Description: Created by IntelliJ IDEA.
 * 具体实现化角色,把文件解码成Avi数据;
 * @Author : 小肥居居头
 * @create 2024/3/10 18:48
 */


public class AviFile implements VideoFile {
    @Override
    public String decode(String fileName) {
        return fileName + "已经被解码成了Avi格式";
    }
}

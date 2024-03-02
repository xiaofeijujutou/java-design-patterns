package com.xiaofei.designpatterns.openclose;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/2 18:51
 */


public class OpenClose {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
    }
}

class GraphicEditor {
    /**
     * 直接使用if else,如果这个时候要加上一个三角形,就要直接改动原有代码;
     * 违反了开闭原则,即不修改原有代码;
     * @param s
     */
    public void drawShape(Shape s) {
        if (s.shape == 0) {
            drawCircle(s);
        } else if (s.shape == 1) {
            drawRectangle(s);
        }
    }

    private void drawCircle(Shape s) {
        System.out.println("画圆");
    }

    private void drawRectangle(Shape s) {
        System.out.println("画方");
    }
}

/**
 * 基类
 */
class Shape {
    int shape;
}

class Circle extends Shape{
    public Circle(){
        super.shape = 0;
    }
}
class Rectangle extends Shape{
    public Rectangle(){
        super.shape = 1;
    }
}
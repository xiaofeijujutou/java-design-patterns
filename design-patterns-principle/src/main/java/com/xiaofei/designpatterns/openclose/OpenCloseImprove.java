package com.xiaofei.designpatterns.openclose;

/**
 * @Description: Created by IntelliJ IDEA.
 * @Author : 小肥居居头
 * @create 2024/3/2 18:51
 */


public class OpenCloseImprove {
    public static void main(String[] args) {
        GraphicEditorImprove graphicEditor = new GraphicEditorImprove();
        graphicEditor.drawShape(new CircleImprove());
        graphicEditor.drawShape(new RectangleImprove());
        graphicEditor.drawShape(new TriangleImprove());
    }
}
class GraphicEditorImprove {
    /**
     * 直接进行抽象,将抽象行为抽取出来,具体行为开发者再进行开发;
     * 这样就可以实现拓展而不用再修改原本代码;
     * @param s
     */
    public void drawShape(ShapeImprove s) {
        s.drawShape();
    }
}
/**
 * 基类
 */
abstract class ShapeImprove {
    int shape;
    abstract void drawShape();
}

class CircleImprove extends ShapeImprove{
    public CircleImprove(){
        super.shape = 0;
    }
    @Override
    void drawShape() {
        System.out.println("画圆");
    }
}

class RectangleImprove extends ShapeImprove{
    public RectangleImprove(){
        super.shape = 1;
    }
    @Override
    void drawShape() {
        System.out.println("画方");
    }
}

class TriangleImprove extends ShapeImprove{
    public TriangleImprove(){
        super.shape = 2;
    }
    @Override
    void drawShape() {
        System.out.println("画三角形");
    }
}
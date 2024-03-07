package com.xiaofei.designpatterns.adapter.mvc;


/**
 * 所以适配器模式的精髓就是:
 * 		有一个方法判断是否适配;
 * 		有一个方法是执行电压转换的方法,也就是针对不同请求和不同Controller要修改一些对应数据;
 * 		也就是说用户发过来的电压可能是1,2,3,4,5,6;
 * 		controller可以处理2,4,6;
 * 		adapter可以1,2->2;3,4->4;5,6->6;
 * 		所以
 * 	如果判断符合适配,那么就执行方法;
 */
public interface HandlerAdapter {

	boolean supports(Controller handler);

	void handle(Controller handler);
}

// 多种适配器类
class SimpleHandlerAdapter implements HandlerAdapter {

	/**
	 * 执行方法handler.doSimplerHandler()
	 * @param handler 接收一个Controller对象
	 */
	public void handle(Controller handler) {
		System.out.println("接收到数字为Simpler的请求,现在往request里加点数据");
		((SimpleController) handler).doSimplerHandler();
	}

	/**
	 * 接收一个handler,判断是否实现了对应接口,只要实现对应接口就是能处理;
	 * @param handler
	 * @return
	 */
	public boolean supports(Controller handler) {
		return (handler instanceof SimpleController);
	}

}

class HttpHandlerAdapter implements HandlerAdapter {

	public void handle(Controller handler) {
		((HttpController) handler).doHttpHandler();
	}

	public boolean supports(Controller handler) {
		return (handler instanceof HttpController);
	}

}

class AnnotationHandlerAdapter implements HandlerAdapter {

	public void handle(Controller handler) {
		((AnnotationController) handler).doAnnotationHandler();
	}

	public boolean supports(Controller handler) {

		return (handler instanceof AnnotationController);
	}

}
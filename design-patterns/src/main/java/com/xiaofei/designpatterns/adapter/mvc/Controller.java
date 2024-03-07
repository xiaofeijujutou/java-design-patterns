package com.xiaofei.designpatterns.adapter.mvc;

/**
 * Controller应该实现的方法:
 * 		根据请求类型来判断本身是否能处理对应请求
 */
public interface Controller {
	/**
	 * 判断自身能不能处理这种Request,能就返回自身,不能就返回null;
	 * @param request
	 * @return
	 */
	Controller getHandler(HttpServletRequest request);

	//ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception;
}

class HttpController implements Controller {
	public void doHttpHandler() {
		System.out.println("http...");
	}

	@Override
	public Controller getHandler(HttpServletRequest request) {
		if (request.getI() == 0){
			return this;
		}
		return null;
	}
}

class SimpleController implements Controller {
	public void doSimplerHandler() {
		System.out.println("simple...");
	}
	@Override
	public Controller getHandler(HttpServletRequest request) {
		if (request.getI() == 1){
			return this;
		}
		return null;
	}
}

class AnnotationController implements Controller {
	@Override
	public Controller getHandler(HttpServletRequest request) {
		if (request.getI() == 2){
			return this;
		}
		return null;
	}
	public void doAnnotationHandler() {
		System.out.println("annotation...");
	}
}

package com.xiaofei.designpatterns.adapter.mvc;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DispatchServlet {

    /**
     * 容器,初始化的时候添加好所有的Adapter适配器请求;
     */
    public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();
    /**
     * 容器,初始化的时候添加好所有的Controller请求;
     */
    public static List<Controller> handlers = new ArrayList<Controller>();

    public DispatchServlet() {
        intiAdapters();
        intiHandlers();
    }

    private void intiHandlers() {
        //使用Spring容器初始化各种Controller
//        Map<String, org.springframework.web.servlet.HandlerAdapter> matchingBeans =
//                BeanFactoryUtils.beansOfTypeIncludingAncestors(context, org.springframework.web.servlet.HandlerAdapter.class, true, false);
        handlers.add(new HttpController());
        handlers.add(new SimpleController());
        handlers.add(new AnnotationController());
    }

    private void intiAdapters() {
        //使用Spring容器初始化各种适配器;
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }


    public void doDispatch(HttpServletRequest request) {
        // 此处模拟SpringMVC从request取handler的对象，
        // 适配器可以获取到希望的Controller
        // 对应mvc这一行代码
        //mappedHandler = getHandler(processedRequest);
        //因为发来的请求不确定到底用什么类型的Controller来处理,所以会去遍历寻找Controller;
        Controller unknownController = getHandler(request);
        for (int i = 0; i < 3; i++) {
            //如果没适配器
            //遍历Controller来判断Controller能不能处理这个request
            //那么每一种Controller里面就要写一种方法:
            //是否能处理request,if a || b || c || d return true
            //这个时候市面上新出了一种request,或者自定了一种,那就要改Controller
            //如果使用适配器,就只要往里面加适配器就行了;
            //而且一个适配器可以对应多种生产者和接受者;
        }
        // 发现服务器可以处理这种请求之后,就要得到这种Controller的适配器
        HandlerAdapter adapter = getHandler(unknownController);
        // 通过适配器执行对应的controller对应方法
        adapter.handle(unknownController);

    }

    /**
     * 根据request请求去映射对应的Controller类型;
     * //mvc去找对应的Handler;
     *
     * @param request
     * @return
     */
    private Controller getHandler(HttpServletRequest request) {
        for (Controller controller : handlers) {
            Controller handler = controller.getHandler(request);
            if (handler != null) {
                return controller;
            }
        }
        return null;
    }

    public HandlerAdapter getHandler(Controller controller) {
        //遍历：根据得到的controller(handler), 返回对应适配器
        for (HandlerAdapter adapter : this.handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        DispatchServlet dispatchServlet = new DispatchServlet();
        Random random = new Random();
        while (true) {
            //假设发送的请求有三种
            try {
                dispatchServlet.doDispatch(new HttpServletRequest(Math.abs(random.nextInt() % 3)));
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}

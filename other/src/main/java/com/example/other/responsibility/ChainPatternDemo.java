package com.example.other.responsibility;

import com.sun.deploy.nativesandbox.comm.Request;
import com.sun.deploy.nativesandbox.comm.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Irvin
 * @description
 * @date 2022/1/26 15:36
 */
@Component
public class ChainPatternDemo {

    //自动注入各个责任链的对象
    @Autowired
    private List<AbstractHandler> abstractHandleList;

    private AbstractHandler abstractHandler;

    //spring注入后自动执行，责任链的对象连接起来
    @PostConstruct
    public void init() {
        for (int i = 0; i < abstractHandleList.size(); i++) {
            if (i == 0) {
                abstractHandler = abstractHandleList.get(0);
            } else {
                AbstractHandler currentHandler = abstractHandleList.get(i - 1);
                AbstractHandler nextHandler = abstractHandleList.get(i);
                currentHandler.setNext(nextHandler);
            }
        }
    }

    //调用这个方法即可
    public Response exec(Request request, Response response) {
        abstractHandler.filter(request, response);
        return response;
    }



}

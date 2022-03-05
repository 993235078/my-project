package com.example.other.responsibility;

import com.sun.deploy.nativesandbox.comm.Request;
import com.sun.deploy.nativesandbox.comm.Response;


/**
 * @author Irvin
 * @description
 * @date 2022/1/26 13:20
 */
public abstract class AbstractHandler {

    //定义下一个对象
    private AbstractHandler next;

    //给下一个对象赋值
    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    public AbstractHandler getNext() {
        return next;
    }

    //具体业务 应该交给子类实现
    public void filter(Request request, Response response) {
        doFilter(request, response);
        if (null != getNext()) {
            getNext().filter(request, response);
        }
    }

    abstract void doFilter(Request request, Response response);
}

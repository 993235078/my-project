package com.example.other.responsibility;

import com.sun.deploy.nativesandbox.comm.Request;
import com.sun.deploy.nativesandbox.comm.Response;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Irvin
 * @description
 * @date 2022/1/26 13:26
 */
@Component
@Order(2)
public class CheckSecurityFilterObject extends AbstractHandler{
    @Override
    void doFilter(Request request, Response response) {
        System.out.println("责任链2");
    }
}

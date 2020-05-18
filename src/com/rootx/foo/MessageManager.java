package com.rootx.foo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageManager {
    @Autowired
    HelloService helloService;

    public void printMessage(){
        String msj=this.helloService.getMessage();
        System.out.println("MessageManage:printMessage(Autowired): "+msj);
    }
}

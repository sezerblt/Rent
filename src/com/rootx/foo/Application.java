package com.rootx.foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class Application {

    @Bean
    public HelloService getMessageService(){
        return new HelloServiceImp();
    }

    public static void main(String[] args) {
        final ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
        final MessageManager messageManager=applicationContext.getBean(MessageManager.class);
        messageManager.printMessage();
    }
}

package com.rootx.foo;

public class HelloServiceImp  implements HelloService{

    @Override
    public String getMessage() {
        return "HelloServiceImp:getMessage: Hello World with Spring BEAN(_XML_)!!";
    }
}

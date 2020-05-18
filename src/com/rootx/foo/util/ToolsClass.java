package com.rootx.foo.util;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ToolsClass implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        String msg = (String)objects[0];
        return new Object();
    }
}

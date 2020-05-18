package com.company.rental;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.core.NamedThreadLocal;

import java.util.HashMap;
import java.util.Map;

public class ThreadScope implements Scope {

    private final ThreadLocal<Map<String,Object>> threadScope =
            new NamedThreadLocal<Map<String,Object>>("ThreadScopeMap"){
                @Override
                protected Map<String, Object> initialValue() {
                    return new HashMap<String, Object>();
                }
            };


    @Override
    public Object get(String s, ObjectFactory objectFactory) {
        Map<String, Object> scope = threadScope.get();
        Object object = scope.get(s);
        if (object == null) {
            object = objectFactory.getObject();
            scope.put(s, object);
        }
        return object;
    }

    @Override
    public Object remove(String s) {
        Map<String, Object> scope = threadScope.get();
        return scope.remove(s);
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return Thread.currentThread().getName().toString();
    }
}

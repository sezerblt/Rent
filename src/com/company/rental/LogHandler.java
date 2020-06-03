package com.company.rental;

import com.company.service.RentalService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {
    private RentalService rentalService;

    public LogHandler(RentalService rentalService) {
        super();
        this.rentalService = rentalService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.nanoTime();
        System.out.println("Invoke işlemi metodu: " + method.getName());
        Object result = method.invoke(this.rentalService, args);
        long end = System.nanoTime();
        System.out.println("Tamamlandi. Sure: " + (end - start) + " ns.");
        return result;
    }
}

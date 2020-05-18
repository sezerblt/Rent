package com.company.rental;

import com.company.service.RentalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        /*
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-foo.xml");
        RentalService rentalService = applicationContext.getBean("rentalServiceSingletonScope",RentalService.class);
        List<Car> carlist=new ArrayList<Car>();
        Car car1 = new Car("fiesta");
        Date begin=Main.getDateBegin();
        Date end=Main.getDateEnd();
        Rental rental=rentalService.rentACar("Ali Aydin",carlist,begin,end);
        System.out.println(rental.toString());
        System.out.println(rental.isRented());
        System.out.println("----------------------------------------------");
        System.out.println("scpoe:"+applicationContext.getBean("rentalServiceSingletonScope",RentalService.class));
        System.out.println("scpoe:"+applicationContext.getBean("rentalServiceSingletonScope",RentalService.class));
        System.out.println("----------------------------------------------");
        ((ClassPathXmlApplicationContext)applicationContext).close();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-thread.xml");
        RentalService rentalService = applicationContext.getBean("rentalService",RentalService.class);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-thread.xml");
        CreditCard creditCard =applicationContext.getBean("creditCard",CreditCard.class);
        Connection connection=creditCard.getConnection();
        System.out.println(creditCard.hashCode());
        System.out.println("1: "+connection);
        */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-.xml");
        RentalService rentalService = applicationContext.getBean("rentalServiceSingletonScope",RentalService.class);
    }

    private static Date getDateBegin() throws ParseException {
        /*
        * String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse("2018-09-09");*/
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date=(Date)simpleDateFormat.parse("2020-05-10");
        return date;
    }
    private static Date getDateEnd() throws ParseException{
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date=(Date)simpleDateFormat.parse("2020-05-12");
        return date;
    }

}

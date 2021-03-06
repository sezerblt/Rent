package com.company.rental;

import com.company.dao.MysqlDatasourceImpl;
import com.company.pojo.Car;
import com.company.service.RentalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        String config_path[]={"spring-xml/spring-pojo.xml","spring-xml/spring-dao.xml","spring-xml/spring-service.xml"};
        ConfigurableApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-xml/spring-factory.xml");

        RentalService rentalService = applicationContext.getBean("rentalService",RentalServiceImpl.class);
        Rental rental = rentalService.rentACar("Sezer Balta",new Car(),null,null);

        System.out.println("service: "+rentalService);

        System.out.println(rental.isRented());

        ((ClassPathXmlApplicationContext)applicationContext).close();
        /*
        Car car = applicationContext.getBean("car2",Car.class);
        MysqlDatasourceImpl mysqlDatasource=applicationContext.getBean("mysqlDataSource",MysqlDatasourceImpl.class);

        System.out.println(car.getModel()+"-"+car.getBrand()+"- "+car.getLicensePlate()+" -"+car.getType()+"-"+car.getYearModel());
        System.out.println("MYSQL: "+mysqlDatasource);
        System.out.println("MYSQL URL: "+mysqlDatasource.getDbConfiguration().getProperty("datasource.url"));
        RentalService service =applicationContext.getBean("rentalService1",RentalServiceImpl.class);
        Car car = applicationContext.getBean("car1",Car.class);
        System.out.println("mycar: "+car.getBrand()+"-"+car.getModel());
        Car car = applicationContext.getBean("car1",Car.class);
        System.out.println("mycar: "+car.getBrand()+"-"+car.getModel());
        ((ClassPathXmlApplicationContext)applicationContext).close();
        ______________________________________________________________________________________
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-foo.xml");
        RentalService rentalService = applicationContext.getBean("rentalServiceSingletonScope",RentalService.class);
        List<Car> carlist=new ArrayList<Car>();

        Car car1 = new Car("fiesta");
        Date begin=Main.getDateBegin();
        Date end=Main.getDateEnd();
        Rental rental=rentalService.rentACar("Orhan Pamuk",carlist,begin,end);
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

         String config_path[]={"spring-rental.xml","spring-foo.xml","spring-thread.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config_path);
        RentalService rentalService = applicationContext.getBean("rental_rentalService",RentalService.class);
        System.out.println("rent service:"+rentalService);
        List<Car> cars= new ArrayList<Car>();
        cars.add(new Car("Aston"));
        cars.add(new Car("Bugatti"));
        cars.add(new Car("Ford"));
        Date d1= getDateBegin();
        Date d2=getDateEnd();
        Rental rental = rentalService.rentACar(
                "Jose Saramago", cars,d1,d2
        );
        System.out.println("rental :"+rental);
        System.out.println("rental case: :"+rental.isRented());
        */
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

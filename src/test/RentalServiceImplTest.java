package test;

import com.company.pojo.Car;
import com.company.rental.*;
import com.company.service.CustomerRepository;
import com.company.service.RentalRepository;
import org.junit.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static junit.framework.Assert.assertTrue;

public class RentalServiceImplTest {

    @Test
    public void hello(){
        System.out.println("deneme");
    }
    @Test
    public void add_new_rental()throws Exception{
        List<Car> car = (List<Car>) new ArrayList<Car>();
        //musteri ve kiralama depolarına alınacak nesne havuzu olusuruldu
        CustomerRepository customerRepository ;
        RentalRepository rentalRepository;
        //Kiralama işlemi için kiralamaHizmeti veren nesne olusturuldu.
        RentalServiceImpl rentalService = new RentalServiceImpl();
        //Kiralama baslangic ve bitis tarihleri olustur.
        Date rentalBegin = new Date(2020,05,06);
        //rentalBegin.parse("22/12/2013");
        Date rentalEnd = new Date(2020,05,10);
        //rentalEnd.parse("29/12/2013");
        //Kiralama icin kiralama servisinden Kiralama nesnei dondur
        Rental rental = rentalService.rentACar("SEZER BALTA",car,rentalBegin,rentalEnd);
        assertTrue(rental.isRented());
        System.out.println("sonuc: "+":"+rental.isRented());

    }




}

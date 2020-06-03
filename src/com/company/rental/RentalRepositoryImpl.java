package com.company.rental;

import com.company.dao.MysqlDatasourceImpl;
import com.company.service.RentalRepository;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("rentalRepository")
public class RentalRepositoryImpl implements RentalRepository {

    //private MysqlDatasourceImpl datasource;

    public RentalRepositoryImpl() {
    }

    public void save(Rental rental){

    }

    /*
    public MysqlDatasourceImpl getDatasource() {
        return datasource;
    }

    public void setDatasource(MysqlDatasourceImpl datasource) {
        this.datasource = datasource;
    }

    @PostConstruct
    public void init() {
    }*/
}

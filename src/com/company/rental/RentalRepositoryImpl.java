package com.company.rental;

import com.company.service.RentalRepository;
import org.springframework.orm.jpa.vendor.Database;

public class RentalRepositoryImpl implements RentalRepository {

    private DummyDataSourceImpl datasource;

    public RentalRepositoryImpl() {
    }

    public void save(Rental rental){

    }

    public DummyDataSourceImpl getDatasource() {
        return datasource;
    }

    public void setDatasource(DummyDataSourceImpl datasource) {
        this.datasource = datasource;
    }
}

package com.mycompany.interfaces;

import com.mycompany.model.RentalCompany;

import java.util.List;

public interface RentalCompanyService {

    List<RentalCompany> getAllRentalCompanies();
    RentalCompany addRentalCompany(RentalCompany rentalCompany);
    RentalCompany updateRentalCompany(RentalCompany rentalCompany);
    void deleteRentalCompany(RentalCompany rentalCompany);

}

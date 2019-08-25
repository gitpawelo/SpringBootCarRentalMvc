package com.mycompany.service;

import com.mycompany.interfaces.RentalCompanyService;
import com.mycompany.model.RentalCompany;
import com.mycompany.repository.RentalCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RentalCompanyServiceImpl implements RentalCompanyService {

    @Autowired
    RentalCompanyRepository rentalCompanyRepository;

    @Override
    public List<RentalCompany> getAllRentalCompanies() {
        return rentalCompanyRepository.findAll();
    }

    @Override
    public RentalCompany addRentalCompany(RentalCompany rentalCompany) {
        return rentalCompanyRepository.save(rentalCompany);
    }

    @Override
    public RentalCompany updateRentalCompany(RentalCompany rentalCompany) {
        return rentalCompanyRepository.save(rentalCompany);
    }

    @Override
    public void deleteRentalCompany(RentalCompany rentalCompany) {
        rentalCompanyRepository.delete(rentalCompany);
    }
}

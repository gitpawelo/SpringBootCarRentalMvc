package com.mycompany.repository;

import com.mycompany.model.RentalCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalCompanyRepository extends JpaRepository<RentalCompany, Long> {
}

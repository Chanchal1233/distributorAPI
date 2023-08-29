package com.app.repository;

import com.app.distributor.Distributor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DistributorRepository
        extends JpaRepository<Distributor, Long> {

    Distributor findByEmail (String email);

    Distributor findByName (String name);

    Distributor findByProvince (String province);

}

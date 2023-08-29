package com.app.service;

import com.app.distributor.Distributor;
import com.app.repository.DistributorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistributorService {



    private final DistributorRepository distributorRepository;

    @Autowired
    public DistributorService(DistributorRepository distributorRepository) {
        this.distributorRepository = distributorRepository;
    }

    public Distributor addDistributor(Distributor distributor){
        return distributorRepository.save(distributor);
    }

    public List<Distributor> addDistributors(List<Distributor> distributors){
        return distributorRepository.saveAll(distributors);
    }


    public List<Distributor> getDistributor() {
        return distributorRepository.findAll();
    }

    public Distributor findDistributorById(Long id){
        return distributorRepository.findById(id).orElse(null);
    }

    public Distributor findDistributorByEmail(String email){
        return distributorRepository.findByEmail(email);
    }

    public Distributor findDistributorByName(String name){
        return distributorRepository.findByName(name);
    }

    public Distributor findDistributorByProvince(String province){return distributorRepository.findByProvince(province);}

    public String deleteDistributor(long id){
        distributorRepository.deleteById(id);
        return "Distributor has been removed " + id;
    }

    public Distributor updateDistributor(Distributor distributor){
        Distributor existingDistributor = distributorRepository.findById(distributor.getDistributorID()).orElse(null);
        existingDistributor.setEmail(distributor.getEmail());
        existingDistributor.setPassword(distributor.getPassword());
        return distributorRepository.save(existingDistributor);
    }

}

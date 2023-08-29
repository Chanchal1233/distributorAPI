package com.app.controller;

import com.app.distributor.Distributor;
import com.app.service.DistributorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/distributor")
public class DistributorController {
    private final DistributorService distributorService;

    @Autowired
    public DistributorController(DistributorService distributorService) {
        this.distributorService = distributorService;
    }

    @PostMapping("/add")
    public Distributor addDistributor(@RequestBody Distributor distributor){
        return distributorService.addDistributor(distributor);
    }

    @PostMapping("/add/multiple")
    public List<Distributor> addDistributors(@RequestBody List<Distributor> distributors){
        return distributorService.addDistributors(distributors);
    }

    @GetMapping("/all")
    public List<Distributor> getDistributor() {
        return distributorService.getDistributor();
    }

    @GetMapping("/find/id/{id}")
    public Distributor findDistributorById(@PathVariable long id) {
        return distributorService.findDistributorById(id);
    }

    @GetMapping("/find/email/{email}")
    public Distributor findDistributorByEmail(@PathVariable String email){
        return  distributorService.findDistributorByEmail(email);
    }

    @GetMapping("/find/name/{name}")
    public Distributor findDistributorByName(@PathVariable String name){
        return  distributorService.findDistributorByName(name);
    }

    @GetMapping("/find/province/{province}")
    public Distributor findDistributorByProvince(@PathVariable String province){
        return  distributorService.findDistributorByProvince(province);
    }

    @PutMapping("/update")
    public Distributor updateDistributor(@RequestBody Distributor distributor){
        return distributorService.updateDistributor(distributor);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDistributor(@PathVariable long id){
        return distributorService.deleteDistributor(id);
    }
}
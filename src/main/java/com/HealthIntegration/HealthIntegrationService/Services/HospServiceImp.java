package com.HealthIntegration.HealthIntegrationService.Services;

import com.HealthIntegration.HealthIntegrationService.Model.Hospital;
import com.HealthIntegration.HealthIntegrationService.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


import java.util.List;

@Service
public class HospServiceImp implements HospService{
    @Autowired
    private Repository repository;
    @Override
    public List<Hospital> GetHosp() {
        return repository.findAll();
    }

    @Override
    public Optional<Hospital> GetHospByID(Long id){
        return repository.findById(id);
    }

    @Override
    public Hospital AddHosp(Hospital hospital) {
        return repository.save(hospital);
    }

    @Override
    public List<Hospital> AddHospitals(List<Hospital> hospitals) {
        return repository.saveAll(hospitals);
    }

    @Override
    public String deleteHospital(Long id) {
        repository.deleteById(id);
        return "Hospital removed !! " + id;
    }

    @Override
    public Hospital updateProduct(Hospital hospital) {
        Hospital existingHospital = repository.findById(hospital.getId()).orElse(null);
        existingHospital.setName(hospital.getName());
        return repository.save(existingHospital);
    }

}

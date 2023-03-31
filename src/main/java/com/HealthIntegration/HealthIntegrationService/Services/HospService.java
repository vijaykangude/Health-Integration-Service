package com.HealthIntegration.HealthIntegrationService.Services;

import com.HealthIntegration.HealthIntegrationService.Model.Hospital;

import java.util.List;
import java.util.Optional;

public interface HospService {
    public List<Hospital> GetHosp();
    public Optional<Hospital> GetHospByID(Long id);
    public Hospital AddHosp(Hospital hospital);
    public List<Hospital> AddHospitals(List<Hospital> hospitals);
    public String deleteHospital(Long id);
    public Hospital updateProduct(Hospital hospital);

}

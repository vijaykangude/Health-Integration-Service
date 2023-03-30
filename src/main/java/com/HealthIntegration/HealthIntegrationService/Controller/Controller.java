package com.HealthIntegration.HealthIntegrationService.Controller;

import com.HealthIntegration.HealthIntegrationService.Model.Hospital;
import com.HealthIntegration.HealthIntegrationService.Services.HospService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
	@Autowired
	private HospService hospService;
	@GetMapping(value="/")
	public String Home(){
		return "Welcome to Spring Boot App";
	}

	@GetMapping(value="/allhosp")
	public List<Hospital> GetHosp() {
		List<Hospital> hospitals = hospService.GetHosp();
		return hospitals;
	}

	@GetMapping("/hospital/{id}")
	public Optional<Hospital> getHospitalById(@PathVariable Long id){
		return hospService.GetHospByID(id);
	}

	@PostMapping("/AddHosp")
	public Hospital AddHosp(@RequestBody Hospital hospital){
		return hospService.AddHosp(hospital);
	}

	@PostMapping("/AddHospitals")
	public List<Hospital> AddHospitals(@RequestBody List<Hospital> hospitals){
		return hospService.AddHospitals(hospitals);
	}

	@PutMapping("/update")
	public Hospital updateProduct(@RequestBody Hospital hospital) {
		return hospService.updateProduct(hospital);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable Long id) {
		return hospService.deleteHospital(id);
	}
}

package com.HealthIntegration.HealthIntegrationService.Repository;

import com.HealthIntegration.HealthIntegrationService.Model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Hospital,Long> {
}

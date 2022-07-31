package com.costinel.workshop_create_job_microservice.repo;

import com.costinel.workshop_create_job_microservice.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<Job, Long> {
}

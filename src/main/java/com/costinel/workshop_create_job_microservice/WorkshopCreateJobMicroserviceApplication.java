package com.costinel.workshop_create_job_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.costinel.workshop_create_job_microservice.repo")
public class WorkshopCreateJobMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkshopCreateJobMicroserviceApplication.class, args);
    }

}

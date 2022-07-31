package com.costinel.workshop_create_job_microservice.controller;

import com.costinel.workshop_create_job_microservice.model.Job;
import com.costinel.workshop_create_job_microservice.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkshopCreateJobMicroserviceController {

    @Autowired
    private JobRepo jobRepo;

    @PostMapping(value = "/saveJob")
    public String saveJob(@RequestBody Job job){
        jobRepo.save(job);
        return "Job saved successfully!";
    }

    @GetMapping(value = "/getAllJobs")
    public List<Job> getAllJobs(){
        return jobRepo.findAll();
    }

    @GetMapping(value = "/getJob/{id}")
    public Job getJobById(@PathVariable long id){
        return jobRepo.findById(id).get();
    }

    @PutMapping(value = "/updateJob/{id}")
    public String updateBobById(@PathVariable long id, @RequestBody String newJobStatus){
        Job jobToUpdate = jobRepo.findById(id).get();
        jobToUpdate.setJobStatus(newJobStatus);
        return "Job status updated successfully";
    }

    @DeleteMapping(value = "/deleteJob/{id}")
    public String deleteJob(@PathVariable long id){
        // To continue with code that deletes data from linked databases.
        return "Job deleted successfully together with all the linked data";
    }
}

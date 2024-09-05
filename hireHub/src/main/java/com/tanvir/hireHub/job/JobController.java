package com.tanvir.hireHub.job;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> getAllJobs() {
        return jobService.findAll();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job) {
        jobService.createJob(job);
        return "Job is created successfully";
    }

    @GetMapping("/jobs/{id}")
    public Job findJobById(@PathVariable Long id) {
        return jobService.getJobById(id);
    }
}

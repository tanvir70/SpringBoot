package com.tanvir.hireHub.job;

import java.util.List;

public interface JobService {
    public List<Job> findAll();
    void createJob(Job job);

    Job getJobById(Long id);
}

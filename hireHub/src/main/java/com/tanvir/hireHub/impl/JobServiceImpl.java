package com.tanvir.hireHub.impl;

import com.tanvir.hireHub.job.Job;
import com.tanvir.hireHub.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private List<Job> jobs = new ArrayList<Job>();
    private Long nextJobId = 1L;

    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setJobId(nextJobId++);
        jobs.add(job);
    }
}

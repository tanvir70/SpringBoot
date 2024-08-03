package com.SpringProject_ONE.myFirstProject.controller;

import com.SpringProject_ONE.myFirstProject.entity.MyProjectEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/entry")
public class MyProjectEntryController {

    private HashMap<Long,MyProjectEntry> myProjectEntries = new HashMap<>();

    @GetMapping
    public List<MyProjectEntry> getMyProjectEntries() {
        return new ArrayList<>(myProjectEntries.values());
    }

    @PostMapping
    public boolean setMyProjectEntries(@RequestBody MyProjectEntry myEntry) {
        myProjectEntries.put(myEntry.getProjectId(),myEntry);
        return true;
    }

    @GetMapping("id/{id}")
    public MyProjectEntry getEntryByProjectId(@PathVariable Long id) {
         return myProjectEntries.get(id);
    }

    @DeleteMapping("id/{id}")
    public MyProjectEntry deleteEntryByProjectId(@PathVariable Long id) {
        return myProjectEntries.remove(id);
    }

    @PutMapping("id/{id}")
    public MyProjectEntry updateEntryByProjectId(@PathVariable Long id, @RequestBody MyProjectEntry myEntry) {
        return myProjectEntries.put(id,myEntry);
    }
}

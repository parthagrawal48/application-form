package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FormData;
import com.example.demo.repository.FormRepository;

@CrossOrigin("*")
@RestController
public class FormController {

    @Autowired
    private FormRepository repository;

    @PostMapping("/submit")
    public String submitForm(@RequestBody FormData formData) {
        repository.save(formData);
        return "Form submitted successfully!";
    }
}
package com.example.homeassignment.controllers;

import com.example.homeassignment.dto.Dto;
import com.example.homeassignment.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    Service service;

@GetMapping("/getData")
public ResponseEntity getData() throws IOException, ParseException {
    return service.getData();
}
}

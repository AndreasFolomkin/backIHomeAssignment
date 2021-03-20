package com.example.homeassignment.controllers;

import com.example.homeassignment.service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

import java.text.ParseException;


@RestController
@CrossOrigin
public class Controller {

    @Autowired
    ServiceClass service;


    @PutMapping("/putFile")
    public ResponseEntity putFile(@RequestParam("file") MultipartFile file) throws IOException, ParseException {

        return ResponseEntity.ok(service.getData(file));
    }
}

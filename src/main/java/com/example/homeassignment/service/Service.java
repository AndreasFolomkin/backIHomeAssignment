package com.example.homeassignment.service;

import com.example.homeassignment.dto.Dto;
import com.example.homeassignment.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
@org.springframework.stereotype.Service
public class Service {
    List<Dto> list = new ArrayList<>();

    @Autowired
    Utils utils;

    public ResponseEntity getData() throws IOException, ParseException {
   return  ResponseEntity.ok(utils.getDataFromFile(list));
    }
}

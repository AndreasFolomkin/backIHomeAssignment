package com.example.homeassignment.service;

import com.example.homeassignment.dto.Dto;
import com.example.homeassignment.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceClass {


    @Autowired
    Utils utils;

    public ResponseEntity<List<Dto>> getData(MultipartFile file) throws IOException, ParseException {
        List<Dto> list = new ArrayList<>();
   return  ResponseEntity.ok(utils.getDataFromFile(list,file));
    }
}

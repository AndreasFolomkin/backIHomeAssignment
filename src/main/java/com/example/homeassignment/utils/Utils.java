package com.example.homeassignment.utils;

import com.example.homeassignment.dto.Dto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.io.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
@Configuration
public class Utils {

    private List<String> getListFromFile() throws IOException {
        List<String> list  = new ArrayList<>();
        File file = new File("DataFIle.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        while (true){
            line = br.readLine();
            if(line == null  ) break;
            if(line.length()>0) list.add(line);
        }
        return list;
    }

    @Bean
    public List<Dto> getDataFromFile(List<Dto> resultList) throws IOException, ParseException {
        List<String> list = getListFromFile();
        for (int i = 0; i <list.size() ; i++) {
            String str = list.get(i);
            if (str.length() != 38) throw new ParseException("Input Length incorrect: " + str.length(),0);
            String sign="";
            String [] strArr;
            if (str.contains("+")){
                sign ="+";
                strArr = str.split("\\+");
            }else {
                sign = "-";
                strArr = str.split("\\-");
            }
            Integer amount = Integer.parseInt(strArr[1]);
            String docType = String.valueOf(strArr[0].charAt(0));
            str= strArr[0].substring(1);
            Integer companyId = Integer.parseInt(str.substring(0,9));
            str=str.substring(9);
            LocalDate date = LocalDate.parse(str.substring(0,8), DateTimeFormatter.ofPattern("yyyyMMdd"));
            str=str.substring(8);
            Integer docId =Integer.parseInt(str);
            resultList.add(new Dto(docType,companyId,date,docId,sign,amount));
        }
        return resultList;
    }
}

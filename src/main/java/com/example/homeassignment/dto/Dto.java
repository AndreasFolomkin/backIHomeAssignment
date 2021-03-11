package com.example.homeassignment.dto;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Data
public class Dto {
    private String docType;
    private Integer companyID;
    private LocalDate date;
    private Integer docId;
    private String sign;
    private Integer amount;
}

package com.example.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CrudDTO {
    private int rollNo;
    private int courseID;
    private String courseName;
    private String studentName;
    private String present;
}

package com.day6.studentreport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
class Student 
{
    private String name;
    private String location;
    private String email;
    private long mobile;
}
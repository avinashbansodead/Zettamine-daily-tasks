package com.day4.vehicleloan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Vehicle
{
 private String vehicleNumber;
 private String modelName;
 private String vehicleType;
 private double price;

}
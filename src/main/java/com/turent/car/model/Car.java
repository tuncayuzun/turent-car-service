package com.turent.car.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document("Car")
@Data
public class Car {
    private UUID id;
    private String status;
    private String group;
    private String brand;
    private String model;
    private String year;
    private String transmission;
    private String fuel;
    private String baseAmount;
    private String depositAmount;
    private int minAgeOfDriver;
    private int minYearOfLicence;
}

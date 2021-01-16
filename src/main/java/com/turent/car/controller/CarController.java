package com.turent.car.controller;

import com.turent.car.api.CarApi;
import com.turent.car.exception.CarError;
import com.turent.car.model.Car;
import org.springframework.http.ResponseEntity;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

public class CarController implements CarApi {
    @Override
    public ResponseEntity<Car> getCar(Map<String, String> header, String carId) {
        return null;
    }

    @Override
    public ResponseEntity<List<Car>> getAllCars(Map<String, String> header) {
        return null;
    }

    @Override
    public ResponseEntity<Car> createCar(Map<String, String> header, @NotNull Car car) {
        return null;
    }

    @Override
    public ResponseEntity<Car> updateCar(Map<String, String> header, @NotNull Car car) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteCar(Map<String, String> header, String carId) {
        return null;
    }
}

package com.payitchi1.carredisapplnapr324.services;

import com.payitchi1.carredisapplnapr324.models.Car;

import java.util.List;

public interface CarSerivce {
    Car getSingleCar(int id);
    List<Car> getAllCar();
    Car CreateCar(Car car);
    void deleteCar(int id);
    void deleteAll();
}

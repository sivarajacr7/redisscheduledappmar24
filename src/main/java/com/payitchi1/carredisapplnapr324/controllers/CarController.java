package com.payitchi1.carredisapplnapr324.controllers;

import com.payitchi1.carredisapplnapr324.dtos.CarReqestDto;
import com.payitchi1.carredisapplnapr324.models.Car;
import com.payitchi1.carredisapplnapr324.services.CarSerivce;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CarController {
    private CarSerivce carService;
    public CarController(CarSerivce carService){
        this.carService = carService;
    }
    @Cacheable(value = "car")
    @GetMapping("/car/{id}")
    public Car GetSingleCar(@PathVariable("id") int id){
        return carService.getSingleCar(id);
    }
    @GetMapping("/car")
    @Cacheable(value = "car")
    public List<Car> GetAllCars(){
        return carService.getAllCar();
    }
    @PostMapping("/car")
    @CachePut(value = "car",key = "#car.id", unless = "#car.brand == null")
    public Car CreateCar(@RequestBody Car car){
        return carService.CreateCar(car);
    }
    @CachePut(value = "car", key = "#car.id", unless = "#car.brand == null")
    @PutMapping("/car/{id}")
    public Car updateCar(@PathVariable("id") int carId, @RequestBody Car car){
        //call service and update details for the given id
        return null;
    }

    @CacheEvict(value = "car", key = "#car.id")
    @DeleteMapping("/car/{id}")
    public Car deleteCar(@PathVariable("id") int carId) {
        Car c = carService.getSingleCar(carId);
        carService.deleteCar(carId);
        return c;
    }
    @CacheEvict(value = "car", key = "#car.id")
    @DeleteMapping("/car")
    public void deleteCar() {
        carService.deleteAll();
    }

}


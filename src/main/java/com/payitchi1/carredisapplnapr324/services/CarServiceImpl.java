package com.payitchi1.carredisapplnapr324.services;

import com.payitchi1.carredisapplnapr324.models.Car;
import com.payitchi1.carredisapplnapr324.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarSerivce{
    private CarRepository carRepository;
    public CarServiceImpl(CarRepository carRepository){
        this.carRepository = carRepository;
    }
    @Override
    public Car getSingleCar(int id) {

        Optional<Car> c = carRepository.findById(id);
        return c.get();
    }

    @Override
    public List<Car> getAllCar() {
        return carRepository.findAll();
    }

    @Override
    public Car CreateCar(Car car) {
        Car savedCar = carRepository.save(car);
        return savedCar;
    }

    @Override
    public void deleteCar(int id) {
        carRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
    carRepository.deleteAll();
    }

}

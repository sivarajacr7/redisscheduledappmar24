package com.payitchi1.carredisapplnapr324.repositories;

import com.payitchi1.carredisapplnapr324.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
}

package com.duying.controller;

import com.duying.domain.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

@RequestMapping("/show")
    public Car show(){
    Car car = new Car();
    return car;
    }
}

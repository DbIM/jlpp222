package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public List<Car> addFiveCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", "15", 96));
        cars.add(new Car("Audi", "A8", 99));
        cars.add(new Car("Hyundai", "Santa Fe", 2003));
        cars.add(new Car("Mitsubisi", "ASX", 2014));
        cars.add(new Car("Mercedes", "SLK", 2022));
        return cars;
    }

    public List<Car> carChosenList(int x){
        List<Car> list = new ArrayList<>();
        for (int i=0; i<x && i<5;i++ ){
            list.add(addFiveCars().get(i));
        }
        return list;
    }
}

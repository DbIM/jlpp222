package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    List<Car> cars = List.of(
            new Car("Lada", "15", 96),
            new Car("Audi", "A8", 99),
            new Car("Hyundai", "Santa Fe", 2003),
            new Car("Mitsubisi", "ASX", 2014),
            new Car("Mercedes", "SLK", 2022),
            new Car("Ferrari", "testarossa", 2021),
            new Car("Lamborgini", "diablo", 2025),
            new Car("Icarus", "256", 1980)
    );

    public List<Car> carChosenList(int x) {
        List<Car> list = new ArrayList<>();
        if (x <= 0) {
            return cars;
        } else {
            for (int i = 0; i < x && i < 5; i++) {
                list.add(cars.get(i));
            }
        }
        return list;
    }
}

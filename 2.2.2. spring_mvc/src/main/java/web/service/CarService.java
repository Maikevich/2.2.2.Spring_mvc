package web.service;

import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static List<Car> getMyCar(Integer count) {
        List<Car> value = new ArrayList<>();
        List<Car> myCars = new ArrayList<>();
        myCars.add(new Car("Mustang", "Alexandr", 10));
        myCars.add(new Car("Porshe", "Dima", 7));
        myCars.add(new Car("BMW", "Vasa", 11));
        myCars.add(new Car("Lada", "Vika", 8));
        myCars.add(new Car("Zaparozhets", "Gleb", 100));
        if (count == null || count > 5 || count < 1) {
            return myCars;
        } else {
            for (int i = 0; i < count; i++) {
                value.add(myCars.get(i));
            }
        }
        return value;
    }
}

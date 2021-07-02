package web.model;

import org.springframework.web.bind.annotation.GetMapping;


public class Car {
    private final String model;
    private final String owner;
    private final int age;

    public Car(String model, String owner, int age) {
        this.model = model;
        this.owner = owner;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car '" +model + "' owner '" + owner + "' age of auto '" + age+"'";
    }
}

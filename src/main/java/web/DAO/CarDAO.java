package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> carList = Arrays.asList(
            new Car("Producer1", "BestCar1", "Color1"),
            new Car("Producer2", "BestCar2", "Color2"),
            new Car("Producer3", "BestCar3", "Color3"),
            new Car("Producer4", "BestCar4", "Color4"),
            new Car("Producer5", "BestCar5", "Color5")
    );


    public List<Car> getList() {
        return carList;
    }
}

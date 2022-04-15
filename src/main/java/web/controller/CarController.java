package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {


    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {

        CarService carService = new CarServiceImpl();
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Producer1", "BestCar1", "Color1"));
        carList.add(new Car("Producer2", "BestCar2", "Color2"));
        carList.add(new Car("Producer3", "BestCar3", "Color3"));
        carList.add(new Car("Producer4", "BestCar4", "Color4"));
        carList.add(new Car("Producer5", "BestCar5", "Color5"));
        List<Car> returnedList = count == null ? carList : carService.getCars(carList, count);

        model.addAttribute("cars", returnedList);
        return "cars";

    }
}

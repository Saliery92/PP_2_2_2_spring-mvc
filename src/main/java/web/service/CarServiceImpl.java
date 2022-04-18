package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.DAO.CarDAOImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    CarDAOImpl carDAO = new CarDAOImpl();
    List<Car> carList = carDAO.getList();


    @Override
    public List<Car> getCars(int count) {
        return (count > 0 && count < 5) ? carList.subList(0, count) : carList;

    }

}

package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;
@Component
public class CarServiceImpl implements CarService {

    private  CarDAO carDAO;
    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars(int count) {
        List<Car> list = carDAO.getList();
        return (count > 0 && count < 5) ? list.subList(0, count) : list;
    }


}

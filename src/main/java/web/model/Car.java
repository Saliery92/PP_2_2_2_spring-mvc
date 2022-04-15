package web.model;

public class Car {
    private String producer;
    private String model;
    private String color;

    public Car() {
    }

    public Car(String producer, String model, String color) {
        this.producer = producer;
        this.model = model;
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class ElectronicDevice {
    private String brand;
    private String model;
    private double price;

    // Конструктор без параметров
    public ElectronicDevice() {}

    // Конструктор с параметрами
    public ElectronicDevice(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Метод для вывода информации об устройстве
    public void displayInfo() {
        System.out.printf("\tБренд: %s; Модель: %s; Цена: %.2f\n", brand, model, price);
    }
}
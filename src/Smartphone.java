public class Smartphone extends ElectronicDevice {
    private String operatingSystem;

    // Конструктор с параметрами
    public Smartphone(String brand, String model, double price, String operatingSystem) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
    }

    // Геттер и сеттер для операционной системы
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    // Переопределение метода displayInfo для вывода дополнительной информации
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("\tОперационная система: %s\n", operatingSystem);
    }
}
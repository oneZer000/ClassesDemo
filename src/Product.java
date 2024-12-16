public class Product {
    private String name;
    private int quantity;
    private double price;

    // Конструктор без параметров
    public Product() {}

    // Конструктор с параметрами
    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Метод для увеличения количества товара
    public void increaseQuantity(int amount) {
        quantity += amount;
    }

    // Метод для уменьшения количества товара
    public void decreaseQuantity(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
        } else {
            System.out.println("Недостаточно товара на складе.");
        }
    }

    // Метод для изменения цены
    public void changePrice(double newPrice) {
        price = newPrice;
    }

    // Метод для вывода информации о продукте
    public void displayInfo() {
        System.out.printf("\tНазвание: %s; Количество: %d; Цена: %.2f\n", name, quantity, price);
    }
}
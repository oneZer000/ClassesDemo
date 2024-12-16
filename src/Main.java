public class Main {
    public static void main(String[] args) {
        // Создание нескольких объектов класса Book
        Book book1 = new Book("Война и мир", "Лев Толстой", 500.0);
        Book book2 = new Book("Преступление и наказание", "Фёдор Достоевский", 450.0);
        Book book3 = new Book("Мастер и Маргарита", "Михаил Булгаков", 380.0);

        System.out.println("Books");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        Student[] students = {
          new Student("Selena", 20, "CS"),
                new Student("Payton", 22, "Math"),
                new Student("Annalise", 21, "Economics"),
                new Student("Jacob", 23, "Biology"),
        };
        Student oldestStudent = Student.findOldestStudent(students);
        if (oldestStudent != null) {
            System.out.println("\nСамый старший студент:");
            oldestStudent.displayInfo(); // Вызываем метод printInfo() для вывода информации
        } else {
            System.out.println("Массив студентов пуст.");
        }

        System.out.println("Product");
        Product product = new Product("Apple", 100, 0.5);
        product.displayInfo();
        product.increaseQuantity(20);
        product.decreaseQuantity(30);
        product.changePrice(0.7);
        product.displayInfo();

        System.out.println("Device");
        ElectronicDevice device = new ElectronicDevice("Samsung", "Galaxy Tab", 299.99);
        device.displayInfo();

        System.out.println("Smartphone");
        Smartphone smartphone = new Smartphone("Apple", "iPhone 14", 999.99, "iOS");
        smartphone.displayInfo();

        System.out.println("Animals");
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dog();
        for (Animal animal: animals){
            animal.makeSound();
        }
    }
}
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String major;

    // Конструктор без параметров
    public Student() {
    }

    // Конструктор с параметрами
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Метод для вывода информации о студенте
    public void displayInfo() {
        System.out.printf("\tИмя: %s; Возраст: %d; Специальность: %s\n", name, age, major);
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    public static Student findOldestStudent(Student[] students) {
        if (students == null || students.length == 0) {
            return null; // Если массив пуст или null, возвращаем null
        }

        Student oldest = students[0];
        for (Student student : students) {
            if (student.compareTo(oldest) > 0) {
                oldest = student;
            }
        }
        return oldest;
    }
}
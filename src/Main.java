//task 1
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
    }
}

class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void show() {
        super.show();
        System.out.println("ID Студента: " + studentId);
    }
}

class Teacher extends Person {
    private String teacherId;

    public Teacher(String name, int age, String teacherId) {
        super(name, age);
        this.teacherId = teacherId;
    }

    public void show() {
        super.show();
        System.out.println("ID Викладача: " + teacherId);
    }
}

class DepartmentHead extends Person {
    private String department;

    public DepartmentHead(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void show() {
        super.show();
        System.out.println("Спеціальність: " + department);
    }
}

//task 2
abstract class Figure {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Trapezium extends Figure {
    private double base1;
    private double base2;
    private double height;
    private double side1;
    private double side2;

    public Trapezium(double base1, double base2, double height, double side1, double side2) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double calculateArea() {
        return (base1 + base2) * height / 2;
    }

    public double calculatePerimeter() {
        return base1 + base2 + side1 + side2;
    }
}



public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Student("Юрій Рущак", 20, "S12345");
        people[1] = new Teacher("Петро Порошенко", 35, "T67890");
        people[2] = new Student("Іван Сірко", 22, "S67890");
        people[3] = new DepartmentHead("Сегрій Петронімус", 45, "Комп'ютерні науки");

        for (Person person : people) {
            person.show();
            System.out.println();
            Rectangle rectangle = new Rectangle(4, 6);
            Circle circle = new Circle(3);
            Trapezium trapezium = new Trapezium(3, 5, 4, 2, 3);

            System.out.println("Трикутник:");
            System.out.println("Місце: " + rectangle.calculateArea());
            System.out.println("Периметр: " + rectangle.calculatePerimeter());

            System.out.println("\nКруг:");
            System.out.println("Місце: " + circle.calculateArea());
            System.out.println("Перимерт: " + circle.calculatePerimeter());

            System.out.println("\nТрапеція:");
            System.out.println("Місце: " + trapezium.calculateArea());
            System.out.println("Периметр: " + trapezium.calculatePerimeter());
        }
    }
}

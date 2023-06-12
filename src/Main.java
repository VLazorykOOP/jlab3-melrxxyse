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
        }
    }
}

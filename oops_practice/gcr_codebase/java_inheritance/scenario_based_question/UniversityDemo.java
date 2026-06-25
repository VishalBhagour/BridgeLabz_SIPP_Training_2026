package oops_practice.gcr_codebase.java_inheritance.scenario_based_question;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    final String studentId;
    double gpa;

    Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Student ID: " + studentId +
               ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    String thesis;

    GradStudent(String name, int age, String studentId,
                double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Thesis: " + thesis;
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        GradStudent gs = new GradStudent(
                "Manjeet", 22, "CS101",
                8.9, "Artificial Intelligence");

        System.out.println(gs);

        System.out.println(gs instanceof Student);
        System.out.println(gs instanceof Person);
    }
}
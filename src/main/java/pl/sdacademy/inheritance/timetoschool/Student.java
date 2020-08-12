package pl.sdacademy.inheritance.timetoschool;

public class Student extends SchoolPerson {
    private int[] grades;



    public int[] getGrades() {
        return grades;
    }

    public Student(String firstName, String lastName, int age, String school, int[] grades) {
        super(firstName, lastName, age, school);
        this.grades = grades;
    }
}

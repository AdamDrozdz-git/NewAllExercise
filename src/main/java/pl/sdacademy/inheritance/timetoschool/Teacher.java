package pl.sdacademy.inheritance.timetoschool;

public class Teacher extends SchoolPerson {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public Teacher(String firstName, String lastName, int age, String school, String subject) {
        super(firstName, lastName, age, school);
        this.subject = subject;
    }
}

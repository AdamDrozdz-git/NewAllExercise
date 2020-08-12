package pl.sdacademy.inheritance.timetoschool;

public class SchoolPerson extends Person {
    private String school;


    public String getSchool() {
        return school;
    }

    public SchoolPerson(String firstName, String lastName, int age, String school) {
        super(firstName, lastName, age);
        this.school = school;
    }
}

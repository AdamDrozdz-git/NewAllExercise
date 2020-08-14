package pl.sdacademy.inheritance.timetoschool;


public class School {


    private Teacher[] teachers;
    private Student[] students;

    public School(Teacher[] teachers, Student[] students) {
        this.teachers = teachers;
        this.students = students;
    }

    public SchoolPerson[] getStudentsAndTTeachers() {
        SchoolPerson[] result = new SchoolPerson[teachers.length + students.length];
        int index = 0;
        for (Teacher teacher : teachers) {
            result[index] = teacher;
            index++;
        }
        for (Student student : students) {
            result[index] = student;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        School school = new School(new Teacher[]{
                new Teacher("john", "Malkowich", 55, "3LO", "Chemia")
        }, new Student[]{
                new Student("Janek", "Kowalski", 15, "3LO", new int[]{2, 4, 5})
        }
        );

    }


}





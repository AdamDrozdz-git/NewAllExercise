package pl.sdacademy.inheritance.timetoschool;

import java.util.Arrays;

public class School {
    private Teacher [] teachers;
    private Student [] students;

    public School(Teacher[] teachers, Student[] students) {
        this.teachers = teachers;
        this.students = students;
    }

    public SchoolPerson[] getStudentsAdnTeachers() {
        SchoolPerson [] result = new SchoolPerson[teachers.length + students.length];
        int index = 0;
        for (Teacher teacher : teachers) {
            result[index] = teacher;
            index ++;
        }

        for(Student student: students){
            result[index] = student;
            index++;
        }
        return result;
    }

    @Override
    public String toString() {
        return "School{" +
                "teachers=" + Arrays.toString(teachers) +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}

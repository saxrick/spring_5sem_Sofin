package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Artem Sofin", 3, 8);
        Student st2 = new Student("Mikhail Ivanov", 3, 9);
        Student st3 = new Student("Elena Sidorova", 1, 10);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }
    public List<Student> getStudents(){
        System.out.println("Start method getStudents");
//        System.out.println(students.get(3));
        System.out.println("Info from method getStudents");
        System.out.println(students);
        return students;
    }
}

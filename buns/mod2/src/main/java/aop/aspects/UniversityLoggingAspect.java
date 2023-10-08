package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforegetStudentsLoggingAdvice(){
//        System.out.println("beforegetStudentsLoggingAdvice: log getting list of students before getStudents method");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//    }
//
//        System.out.println("afterReturningStudentsLoggingAdvice: log getting list of students after getStudents method");
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingStudentsLoggingAdvice: log throwing exceptions" + exception);
//    }
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: log normal finish or exceptions");
    }
}


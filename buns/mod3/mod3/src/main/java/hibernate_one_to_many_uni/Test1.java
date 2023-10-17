package hibernate_one_to_many_uni;


import hibernate_one_to_many_uni.entity.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {

            session = factory.getCurrentSession();
            session.beginTransaction();
            Scanner in = new Scanner(System.in);
            System.out.println("имя");
            String name = in.nextLine();
            System.out.println("Фамилия");
            String sur = in.nextLine();
            System.out.println("зарплата");
            int sal = in.nextInt();
            Department dep = new Department("HR", 500, 1500);
            Employee emp1 = new Employee(name, sur, sal);
            dep.addEmployeeToDepartment(emp1);
            session.save(dep);
            session.getTransaction().commit();
            System.out.println("Done!");


//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 5);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//            session.getTransaction().commit();
//            System.out.println("Done!");


            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 15);
            System.out.println(employee);

            session.getTransaction().commit();
            System.out.println("Done!");


            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 4);
            session.delete(department);


            session.getTransaction().commit();
            System.out.println("Done!");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}

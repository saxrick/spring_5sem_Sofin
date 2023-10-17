package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {

            Scanner in = new Scanner(System.in);
            System.out.println("имя");
            String name = in.nextLine();
            System.out.println("Фамилия");
            String sur = in.nextLine();
            System.out.println("департамент");
            String depart = in.nextLine();
            System.out.println("зарплата");
            int sal = in.nextInt();
            session = factory.getCurrentSession();
            Employee employee = new Employee(name, sur, depart, sal);
            Detail detail = new Detail("New-York", "324321231","nikolay@gmail.com");
            detail.setEmployee(employee);
            session.beginTransaction();
            employee.setEmpDetail(detail);
            session.save(detail);

            session.getTransaction().commit();
            System.out.println("Done!");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 4);
//            System.out.println(detail.getEmployee());
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 1);
//            detail.getEmployee().setEmpDetail(null);
//            session.delete(detail);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}

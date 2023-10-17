package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
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
            Scanner in1 = new Scanner(System.in);
            System.out.println("город");
            String city = in1.nextLine();
            System.out.println("номер телефона");
            String pnum = in1.nextLine();
            System.out.println("эл. почта");
            String email = in1.nextLine();

            Detail detail = new Detail(city, pnum, email);
            employee.setEmpDetail(detail);
            session.beginTransaction();

            session.persist(employee);

            session.getTransaction().commit();
            System.out.println("Done!");

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700);
//            Detail detail = new Detail("Moscow", "1245678911", "olejka@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 10);
            System.out.println(emp.getEmpDetail());

            session.getTransaction().commit();
            System.out.println("Done!");
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp1 = session.get(Employee.class, 2);
            session.delete(emp1);

            session.getTransaction().commit();
            System.out.println("Done!");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}

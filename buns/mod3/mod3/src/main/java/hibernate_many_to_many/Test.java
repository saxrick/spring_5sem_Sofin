package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;

        try{
            session = factory.getCurrentSession();
            Scanner in = new Scanner(System.in);
            System.out.println("Секция");
            String sec = in.nextLine();
            System.out.println("имя");
            String name = in.nextLine();
            System.out.println("возраст");
            int age = in.nextInt();


            Section section1 = new Section(sec);
            Child child1 = new Child(name, age);

            section1.addChildToSection(child1);
            session.beginTransaction();
            Section section = session.get(Section.class, 4);
            System.out.println(section.getChildren());

            session.persist(section1);
            session.getTransaction().commit();
            System.out.println("Done!");


//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Igor", 10);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//            session.beginTransaction();
//            session.save(child1);
//            session.getTransaction().commit();
//            System.out.println("Done!");

//
            session = factory.getCurrentSession();
            session.beginTransaction();
            Section section2 = session.get(Section.class, 1);
            System.out.println(section2.getChildren());
            session.getTransaction().commit();
            System.out.println("Done!");


//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Section section = session.get(Section.class, 7);
//            session.delete(section);
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
            session = factory.getCurrentSession();
            session.beginTransaction();
            Child child = session.get(Child.class, 9);
            session.delete(child);
            session.getTransaction().commit();
            System.out.println("Done!");
        }


        finally{
            session.close();
            factory.close();
        }
    }
}

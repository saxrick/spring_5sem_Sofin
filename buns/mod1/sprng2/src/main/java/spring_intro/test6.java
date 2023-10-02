package spring_intro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);

//        cat.say();
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
//        person.callYourPet();
//        Person person2 = context.getBean("personBean", Person.class);
//        System.out.println(person);
//        System.out.println(person2);

        context.close();
    }
}

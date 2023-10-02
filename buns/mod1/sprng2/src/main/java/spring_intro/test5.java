package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();
        context.close();
    }
}

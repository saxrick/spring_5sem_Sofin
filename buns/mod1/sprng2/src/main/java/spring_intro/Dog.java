package spring_intro;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component

public class Dog implements Pet{
//    private String name;
    public Dog(){
        System.out.println("Dog bean is created");
    }
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

//    @PostConstruct
//    protected void init() {
//        System.out.println("Class Dog: init");
//    }
//    @PreDestroy
//    private void destroy() {
//        System.out.println("Class Dog: destroy");
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}

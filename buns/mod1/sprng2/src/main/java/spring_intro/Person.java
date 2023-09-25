package spring_intro;

public class Person {
    private Pet pet;
    private String surname;
    private int age;


public Person() {
        System.out.println("Person bean is created");
   }
    public void setPet(Pet pet) {
        System.out.println("pet set");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Person set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Person set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("hello pet");
        pet.say();
    }
}

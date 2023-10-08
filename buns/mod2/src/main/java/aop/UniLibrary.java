package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("we're taking a book from the unilibrary");
        System.out.println("---------------------------------------");
    }
    public String returnBook(){
//        int a = 10/0;
        System.out.println("we're returning a book to the library");
        return "War and Peace";
    }
    public void getMagazine(){
        System.out.println("we're taking a magazine from the unilibrary");
        System.out.println("-------------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("we're returning a magazine to the unilibrary");
        System.out.println("--------------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("we're adding a book to the unilibrary");
        System.out.println("---------------------------------------");
    }

    public void addMagazine(){
        System.out.println("we're adding a magazine to the unilibrary");
        System.out.println("-----------------------------------------");
    }
}

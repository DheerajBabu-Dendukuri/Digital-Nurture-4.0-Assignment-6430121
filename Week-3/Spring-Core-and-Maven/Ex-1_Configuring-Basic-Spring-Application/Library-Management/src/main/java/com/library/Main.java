package com.library;
import com.library.Repository;
import com.library.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = (BookService) context.getBean("bookService");
        service.displayBook();
    }
}
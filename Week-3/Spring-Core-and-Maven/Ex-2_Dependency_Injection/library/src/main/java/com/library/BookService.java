package com.library;

public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    public void getBookFromRepository(){
        System.out.println("Class Book Service : calling book repository");
        System.out.println(bookRepository.getBook());
    }
}

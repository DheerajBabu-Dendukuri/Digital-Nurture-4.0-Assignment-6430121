package com.library;

public class BookService {
    private Repository bookRepository;
    public void setBookRepository(Repository bookRepository){
        this.bookRepository = bookRepository;
    }
    public void displayBook(){
        String book = bookRepository.getBook();
        System.out.println("Book from repository: "+book);
    }
}

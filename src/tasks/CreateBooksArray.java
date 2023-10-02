/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import tasks.createbooksarray.Author;
import tasks.createbooksarray.Book;

/**
 *
 * @author admin
 */
public class CreateBooksArray {

    public void doCreateArray() {
        Book book = new Book();
        Author levTolstoy = new Author("Tolstoy", "Lev");
        Author[] authorVoinaIMir = new Author[1];
        authorVoinaIMir[0]=author;
        Book[] books = new Book[5];
        books[0] = new Book("Voina i mir", 2020, authorVoinaIMir);
    }
    
}

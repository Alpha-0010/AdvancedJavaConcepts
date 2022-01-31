/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

/**
 *
 * @author shashwat
 */

/*

Why do we need Streams over for each loops in Java:
A) With for each loops it is hard to write parallel external iterations.
B) It sometimes needs a lot of boilerplate code.
C) Sometimes it is diffiult to read or time consuming.

Streams were introduced in Java-8. It uses internal loops instead of external loops.


*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Books> books=allBooks();
        
        // Print all the books that starts with 'j'
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("j");
        }).forEach(System.out::println);
        
        // Books with author starting with "j" and title starting with "e".
        System.out.println("................");
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("j");
        }).filter(book -> {
            return book.getTitle().startsWith("e");
        }).forEach(System.out::println);
        
        /* filter() is a passive method and there can be infinite passive methods whereas
         there can only be one eager method like the forEach method.*/
        
        
        // Parallel iteration using stream
        
        
    }
    
    private static List<Books> allBooks(){
        List<Books> library=new ArrayList<>();
        library.add(new Books("jkl", "exyz"));
        library.add(new Books("ajkl", "eyzq"));
        library.add(new Books("jak", "x"));
        library.add(new Books("jk", "harry"));
        library.add(new Books("back", "bmw"));
        return library;
    }
    
}

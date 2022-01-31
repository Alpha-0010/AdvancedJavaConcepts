/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

/**
 *
 * @author shashwat
 */
public class Books {
    private String author;
    private String title;
    
    public Books(String author,String title){
        this.author=author;
        this.title=title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getTitle(){
        return title;
    }
    
    @Override
    public String toString(){
        return ("Author: "+author+",Title: "+title);
    }
    
}

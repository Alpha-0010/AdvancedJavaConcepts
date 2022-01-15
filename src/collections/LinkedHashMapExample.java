/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

/**
 *
 * @author shashwat
 */

import java.util.*;
public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> phoneBook=new LinkedHashMap<>();
        phoneBook.put("Alexis",110234);
        phoneBook.put("Brenda", 101987);
        phoneBook.put("Emily",134590);
        phoneBook.put(null,000);
        System.out.println(phoneBook.toString());
        if(phoneBook.containsKey("Brenda")){
            phoneBook.remove("Brenda");
        }
        System.out.println(phoneBook.toString());
    }
}

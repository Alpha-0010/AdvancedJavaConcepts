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
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> myList=new LinkedList<>();
        myList.add("a");
        myList.add("abc");
        myList.add(1,"b");
        System.out.println(myList.toString());
        myList.remove("b");
<<<<<<< HEAD
        System.out.println(myList.toString());
=======
        System.err.println(myList.toString());
>>>>>>> 4bf3e7712609f7263bcf12725ede5ce4a651d83c
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjava;

/**
 *
 * @author shashwat
 */
import java.util.*;


public class Varargs {

    public static void main(String[] args) {
        String name1 = "Alex";
        String name2 = "Alexis";
        String name3 = "David";
        printNameList(name1, name2, name3);
    }

    private static void printNameList(String... items) {
        System.out.println("Printing Names...");
        for (String item : items) {
            System.out.println(item);
        }
    }

}

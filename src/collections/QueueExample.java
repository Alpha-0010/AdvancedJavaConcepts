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
public class QueueExample {
    public static void main(String[] args) {
        Queue<Customer> queue=new LinkedList<>();
        queue.add(new Customer("Alexis"));
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Angelica"));
        System.out.println(queue.toString());
        Customer firstCustomer=queue.poll();
        System.out.println(firstCustomer);
        System.out.println(queue.toString());
    }
}

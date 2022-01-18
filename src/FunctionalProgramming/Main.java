/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FunctionalProgramming;

/**
 *
 * @author shashwat
 */
public class Main {
    public static void main(String[] args) {
        functionalInterfaceExample gm=new functionalInterfaceExample() {
            @Override
            public void greet(String name) {
                System.out.println("Hello "+name+"!!");
            }
        };
        gm.greet("Alexis");
        /*
        Lambda method are used to implement functional interfaces in java...
        They are used to quickly implement functional interfaces in java...
        */
        functionalInterfaceExample gm2= (String name) -> {
            System.out.println("Hello "+name+"!!");
        };
        gm2.greet("Emma");
    }
}

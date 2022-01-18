/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package FunctionalProgramming;

/**
 *
 * @author shashwat
 */
/*

Functional Interfaces can have only one abstract method .i.e. they can only implement one
functionality. The implementation of the abstract method of a functional interface can be
a bit messy so to avoid that lambdas were introduces in java8.

main of this functionalInterface is implemented in Main.java file.

*/
@FunctionalInterface
public interface functionalInterfaceExample {
    public abstract void greet(String name);
}

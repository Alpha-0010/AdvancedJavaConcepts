/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodReferenceExample;

/**
 *
 * @author shashwat
 */
public class Main {
    public static void main(String[] args) {
        Square s=new Square(4);
        // Without Method Reference...
        /*Shapes shapes = (Square square) -> {
          return square.calculateArea();
        };*/
        // With Method Reference...
        Shapes shapes= Square::calculateArea;
        System.out.println("Area: "+shapes.getArea(s));
    }
}

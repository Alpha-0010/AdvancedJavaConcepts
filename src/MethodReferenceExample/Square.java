/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodReferenceExample;

/**
 *
 * @author shashwat
 */
public class Square {
    int sideLength;
    
    public Square(int sideLength){
        this.sideLength=sideLength;
    }
    
    public int calculateArea(){
        return sideLength*sideLength;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

/**
 *
 * @author shashwat
 */
public class Customer {
    private String Name;
    private boolean hasbeenServed;
    
    public Customer(String Name){
        this.Name=Name;
        hasbeenServed=false;
    }
    
    public void serve(){
        hasbeenServed=true;
        System.out.println(Name+"has been served");
    }
    
    @Override
    public String toString(){
        return Name;
    }
    
}

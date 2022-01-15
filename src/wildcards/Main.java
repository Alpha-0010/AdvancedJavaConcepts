/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wildcards;

import java.util.*;

/**
 *
 * @author shashwat
 */
public class Main {
    public static void main(String[] args) {
        Buildings B1=new Buildings();
        System.out.println(B1.toString());
        Houses H1=new Houses();
        System.out.println(H1.toString());
        
        List<Buildings> buildings=new ArrayList<>();
        buildings.add(new Buildings());
        buildings.add(new Buildings());
        printBuildings(buildings);
        
        List<Houses> houses=new ArrayList<>();
        houses.add(new Houses());
        houses.add(new Houses());
        printHouses(houses);
        
        printBuildings(houses);
        
    }

    static void printHouses(List<Houses> houses) {
        for(Houses house : houses){
            System.out.print(house+" ");
        }
        System.out.println();
    }
    
    /* ? is called wildcard. Now printBuldings method can also handle a List of 
     type of House.
    */
    static void printBuildings(List< ? extends Buildings> buildings) {
       for(Buildings building : buildings){
            System.out.print(building+" ");
        }
        System.out.println();
    }

}

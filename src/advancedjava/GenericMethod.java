/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedjava;
import java.util.*;

/**
 *
 * @author shashwat
 */
public class GenericMethod {

    /**
     * @param args the command line arguments
     */
    
    static Integer[] intArray={1,2,3,4,5};
    static Character[] charArray={'a','b','c'};
    static Boolean[] boolArray={true,false,false};
    
    private static <T> List<T> arrayToList(T[] arr,List<T> list){
        for(T object : arr){
            list.add(object);
        }
        return list;
    }
    
    
    
    public static void main(String[] args) {
        List<Integer> list=arrayToList(intArray,new ArrayList<>());
        System.out.println(list);
        List<Character> charList=arrayToList(charArray,new ArrayList<>());
        System.out.println(charList);
    }
    
}

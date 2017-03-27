/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Estudiante
 */
public class JavaApplication7 {

    public static void main(String[] args) {
        //crear objetos de tipo A (El padre, el padre tiene la sig info.
        
        A a = new A(5);
        System.out.println(a.getA1());
        
        B b = new B (10 , 5);
        System.out.println(b.getA1()+ " " +b.getB1());
        
    }
    
}

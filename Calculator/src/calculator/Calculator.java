/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Give A a value");
        int a = in.nextInt();
        System.out.println("Give B a value");
        int b = in.nextInt();
        System.out.println("A + B = " + (a + b) );
        System.out.println("A - B = " + (a - b) );
        System.out.println("A * B = " + (a * b) );
        System.out.println("A / B = " + (a / b) );
        // TODO code application logic here
        
    }
    
}

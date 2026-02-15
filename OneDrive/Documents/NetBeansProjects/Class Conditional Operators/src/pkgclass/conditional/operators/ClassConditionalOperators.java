/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgclass.conditional.operators;

/**
 *
 * @author User
 */
public class ClassConditionalOperators {

    public static void main(String[] args) {
        int a =  22;
        int b = 20;
        int c= a%b;
        String d = c >= 1? "Number is even" : "Number is odd";
        
        System.out.println("the remainder is: " + c);
        System.out.println(d);
       
       
    }
    
}

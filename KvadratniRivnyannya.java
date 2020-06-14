/*
 * Рішення квадратних рівнянь
 */
package kvadratnirivnyannya;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kvitka
 */
public class KvadratniRivnyannya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Введіть значення a:");
        Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
        System.out.println("a = " + a);
        System.out.println("Введіть значення b:");
        scan = new Scanner(System.in);
	int b = scan.nextInt();
        System.out.println("b = " + b);
        System.out.println("Введіть значення c:");
        scan = new Scanner(System.in);
	int c = scan.nextInt();
        System.out.println("c = " + c);
        System.out.println("Рівняння: " + a + "x^2 + " + b + "x + " + c +" = 0");
        int stepin = 2;
        double D = Math.pow(b, stepin) - 4 * a * c;
        
        double x1 = (-b + Math.sqrt(D))/2*a;
        double x2 = (-b - Math.sqrt(D))/2*a;
        
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
    
}

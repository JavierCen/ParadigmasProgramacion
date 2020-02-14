/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodedural.estruturasdecontrol;
import java.util.*;
/**
 *
 * @author Francisco
 */
public class ProdeduralEstruturasDeControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Introduce el primer número:");
        numero1 = sc.nextDouble();
        System.out.println("Introduce el segundo número:");
        numero2 = sc.nextDouble();
        System.out.println("Números introducido: " + numero1 + "  " + numero2);
        System.out.println
          (numero1 + " + " + numero2 + " = " + (numero1+numero2));
        System.out.println
          (numero1 + " - " + numero2 + " = " + (numero1-numero2));
        System.out.println
          (numero1 + " * " + numero2 + " = " + numero1*numero2);
    }
    
}

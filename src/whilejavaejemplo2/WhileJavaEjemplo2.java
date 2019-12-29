/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whilejavaejemplo2;
import java.util.Scanner;
/**
 *
 * @author Walter Galdamez
 */
public class WhileJavaEjemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador=0;
    
        Scanner limite= new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 20: ");
        int limiteDefinido=limite.nextInt();
        System.out.println("Numero ingresado: "+limiteDefinido);
        System.out.println("\n");


        while(contador <= limiteDefinido){
            System.out.println("Contador: "+contador);
            contador++;
        }
    }
    
}

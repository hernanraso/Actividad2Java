/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner=new Scanner(System.in);
       
                
        System.out.println("Ingrese un nombre: ");
        
        String nombre=scanner.nextLine();
        
        System.out.println("Ingrese un apellido: ");
        
        String ape=scanner.nextLine();
        
        System.out.println("Ingrese su edad: ");
        
        int edad=scanner.nextInt();
        
        System.out.println("Ingrese su hobbie: ");
        
        String hobbie=scanner.next();
        
        System.out.println("Indique su editor de codigo preferido: ");
        
        String editor=scanner.next();
        
        System.out.println("Sistema Operativo que utiliza: ");
        
         String so=scanner.next();
         
        System.out.println("Nombre: "+ nombre + " " + "Apellido: " + ape + " " + "Edad " + edad + " " + "Hobbie " + hobbie + " " + "Editor de codigo preferido " + editor + " " + "Sistema Operativo que utiliza: " + so + " ");
    }
    
}

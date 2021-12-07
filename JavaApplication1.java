
package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 {
    public static void main(String[] args) {
    Scanner kcy = new Scanner(System.in);
    System.out.println("Ingrese su nombre");
    String nombre = kcy.nextLine();
    System.out.println("Ingrese su apellido");
    String apellido = kcy.nextLine();
    System.out.println("Ingrese su edad");
    int edad = kcy.nextInt();
    System.out.println("Ingrese su hobbie");
    kcy.nextLine();
    String hobbie = kcy.nextLine();
    System.out.println("Ingrese su editor de código preferido");
    String editor = kcy.nextLine();
    System.out.println("Ingrese nombre del sistema operativo que utiliza");
    String sist = kcy.nextLine();
    
    System.out.println("Los datos ingresados son:");
    System.out.println("Nombre: "+ nombre);
    System.out.println("Apellido: "+apellido);
    System.out.println("Edad: "+edad);
    System.out.println("Hobbie: "+hobbie);
    System.out.println("Su editor de código preferido: "+editor);
    System.out.println("Sistema operativo que utiliza: "+sist);
}
}

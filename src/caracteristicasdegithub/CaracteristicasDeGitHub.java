/*
 Caracteristicas de GitHun 

 */
package caracteristicasdegithub;

/**
 *
 * @author Medardo Rene Chango Caguan 
 */
import java.util.Scanner;
public class CaracteristicasDeGitHub {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("CARACTERISTICAS DE GitHub");
        
        System.out.println("-Escriba para que sirve el Software GitHub ");
        String GitHub=objeto.nextLine();
        
        System.out.println("-Conteste: El software GitHub consta de con otra version ");
        String conteste=objeto.nextLine();
        
        System.out.println("-¿Que control permite GitHub realizar en los proyectos ?");
        String control=objeto.nextLine();
        
        System.out.println("-Para que esta desarrollada GitHub");
        String desarrollada=objeto.nextLine();
        
        System.out.println("-Que ocurrre con GitHub en la actualidad con su mejoramiento");
        String mejoramiento=objeto.nextLine();
        
        System.out.println("--- Gracias por llenar los datos :)");
        
    }
    
}

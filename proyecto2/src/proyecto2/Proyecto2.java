
package proyecto2;

import java.util.ArrayList;
import java.util.Scanner;

public class Proyecto2 {

    /**
Ingresar a una lista enlazada simple n elementos y calcular cual es el mayor de 
lalista. Imprimir el número mayor y luego la lista. 
     */
    public static void main(String[] args) {
    
        Scanner read = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        int numeroMayor =0;
        int numeroMenor =0;
        System.out.println("Lista, numero mayor y menor");
        System.out.println("Digite la cantidad de números de la lista");
        int cantidadNumeros = read.nextInt();
         for(int i=0; i<cantidadNumeros; i++ ){
             System.out.println("Digite el número en la posición"+(i+1));
             int ptp = read.nextInt();// posición temporal
             if(i==0){
                 numeroMenor=ptp; 
                 numeroMenor = ptp;
             }else if (ptp<numeroMenor){
                 numeroMenor = ptp; 
             }
             if (ptp>numeroMayor){
                 numeroMayor = ptp;
             }
             lista.add(ptp);
         }
        System.out.println("El número mayor es: "+numeroMayor);
        System.out.println("El número menor es: "+numeroMenor);
        System.out.println("La lista es: "+lista );
    }
    
}

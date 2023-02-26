
package proyecto1;

import java.util.Scanner;

public class Proyecto1 {

    /**
      A partir de un arreglo que posee N cantidad de promedios de estudiantes 
    colocarlos en una lista y sacar el promedio global de todos los estudiantes. 
    * Se debe verificar que los elementos que están en la lista son correcto
    (rango de 0 a 5). Imprimir todos los promedios y el promedio 
    global.
     */
    public static void main(String[] args) {
        float acum = 1; // Acumulado
        float notas = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas a promediar");
        float cn = read.nextFloat(); // Cantidad de notas
        
        while(acum <= cn){
            System.out.println("Ingrese la nota numero: "+acum);
            float n = read.nextFloat();
            notas += n;
            acum++;
        }
        float promedio = notas;
        float promedioTotal = notas/cn;
        System.out.println("La suma de los promedios es: "+promedio);
        System.out.println("El promedio total es:"+promedioTotal);
        
    }
    
}

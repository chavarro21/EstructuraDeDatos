
package proyecto11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PROYECTO11 {
/*
  A partir de un arreglo que posee N cantidad de promedios de estudiantes 
colocarlos en una lista y sacar el promedio global de todos los estudiantes. Se debe 
verificar que los elementos que están
en la lista son correcto (rango de 0 a 5). Imprimir todos los promedios y el promedio 
global.  
    */

    public static void main(String[] args) {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cantidadEstudiantes;
        do {
            //Primero leemos la cantidad de estudiantes que hay
            System.out.println("Introduzca la cantidad de estudiantes que tiene el grupo: ");
            try {
                cantidadEstudiantes = Integer.parseInt(br.readLine());
                if (cantidadEstudiantes < 1) {
                    System.out.println("Cantidad inválida\nRegresemos....");
                }
            } catch (IOException | NumberFormatException ex) {
                cantidadEstudiantes = -1;
                System.out.println("Hubo un error de lectura\nRegresemos...");
            }
        } while (cantidadEstudiantes < 0);
 
        Estudiante[] estudiantes = new Estudiante[cantidadEstudiantes];
        double[] promedios = new double[cantidadEstudiantes];
 
        //Ahora leemos los datos de los estudiantes
        for (int i = 0; i < estudiantes.length; i++) {
            try {
                Estudiante e = new Estudiante();
                System.out.println("Datos del estudiante: " + (i + 1));
                System.out.println("Introduzca el nombre:");
                e.setNombre(br.readLine());
                System.out.println("Introduzca el apellido:");
                e.setApellido(br.readLine());
                for (int j = 0; j < e.getCalificaciones().length; j++) {
                    try {
                        System.out.println("Introduzca la calificación de la materia " + (j + 1) + ":");
                        e.setCalificacion(j, Integer.parseInt(br.readLine()));
                    } catch (IOException | NumberFormatException ex) {
                        System.out.println("Hubo un error de lectura\nRegresemos...");
                        j--;
                    }
                }
                estudiantes[i] = e;
                promedios[i] = e.getPromedio();
            } catch (IOException | NumberFormatException ex) {
                System.out.println("Hubo un error de lectura\nRegresemos...");
                i--;
            }
        }
 
        //a continuación mostramos los datos de los estudiantes
        System.out.println("\n\n\nA continuación los datos de los estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("\nEstudiante # " + (i + 1) + " :");
            System.out.println(estudiantes[i].toString());
        }
        //a continuación mostramos los datos de los estudiantes
        System.out.println("\n\n\nA continuación el arreglo de los promedios:");
        int t = 0;
        for (int i = 0; i < promedios.length; i++) {
            t += promedios[i];
            System.out.println("Promedio #" + (i + 1) + ":" + promedios[i]);
        }
        System.out.println("Promedio general del grupo: " + (t / Double.valueOf(promedios.length)));
    }
   
    }





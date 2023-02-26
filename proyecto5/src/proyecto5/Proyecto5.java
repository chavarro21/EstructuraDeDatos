
package proyecto5;

public class Proyecto5 {

    /**
.   Realizar un programa que inicialice una lista con 10 valores aleatorios (del 1 al 10) 
y posteriormente muestre en pantalla cada elemento de la lista junto con su 
cuadrado y su cubo.
     * @param args
     */
    public static void main(String[] args) {
        
      int numero [] = new int[10];
      for (int i=1; i<=10; i++){
          numero [i] = (int)(Math.random()*10);
          System.out.println("Numero = "+numero [i]);
          System.out.println("Cuadrado = "+numero [i]*numero [i] );
          System.out.println("Cubo = "+numero [i]*numero [i]*numero [i]);
          System.out.println("");
      }
    }
    
}

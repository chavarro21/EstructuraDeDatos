
package proyecto3;

import javax.swing.JOptionPane;

/**
Crear un programa que permita la matrícula de N estudiantes, se debe guardar
los datos del estudiante: nombres, apellidos, documento también se debe guardar
los datos del curso que va inscribir, del curso: id de curso, nombre del curso,
duración, capacidad. Un estudiante solo puede matricular un curso y un curso puede
matricular la cantidad de estudiante que dice su capacidad. Mostrar un menú con
las sgtes opciones: *Agregar estudiante * Matricular estudiante, * Eliminar
estudiante, *Actualizar Estudiante, *Listar estudiantes, *Listar estudiantes con
matrícula, *Agregar curso, *Eliminar Curso *Listar Cursos.
 */
public class Proyecto3 {
    static inventory Inventory;
    private course Course;

    public static void main(String[] args) {
        begin();
        
    }
    public static void begin (){
        Inventory = new inventory ();
        short option = 0;
        do{
         option = Short.parseShort(JOptionPane.showInputDialog("Menú de opciones\n"
                 + "1.Nuevo Curso\n2.Actualizar Curso\n3.Mostrar Lista\n4.Eliminar\n5.salir"));
            switch (option) {
                case 1:
                   newCourse(); 
                    break;
                case 2:
                    updaCourse();
                    break;
                    case 3:
                    lisCourse();
                    break;
                    case 4:
                    removeCourse();
                    break;
                default:
                    break;    
            }
        }while(option !=4);

    }
    private static void newCourse(){
        String name = JOptionPane.showInputDialog("Nombre del Curso: ");
        String descrition = JOptionPane.showInputDialog("Descripción del Curso: ");
        int cap = Integer.parseInt(JOptionPane.showInputDialog("Capacidad del Curso: ") );
        Inventory.newCourse(name, descrition, cap);
        
    }
   private static void updaCourse(){
    String name = JOptionPane.showInputDialog("Nombre del Curso que se va actualizar: ");
        String descrition = JOptionPane.showInputDialog("Nueva Descripción del Curso: ");
        int cap = Integer.parseInt(JOptionPane.showInputDialog("Nueva Capacidad del Curso: ") );
        Inventory.updateCourse(name, descrition, cap);
   }
        private static void removeCourse(){
     String name = JOptionPane.showInputDialog("Nombre del Curso que se va a borrar : ");
        Inventory.printCourses();
}
   private static void lisCourse(){
        Inventory.printCourses();
   
}
}







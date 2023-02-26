
package proyecto11;

public class Estudiante {
  
    private String nombre;
    private String apellido;
    private int[] calificaciones;
 
    public Estudiante() {
        nombre = "";
        apellido = "";
        calificaciones = new int[5];
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = -1;
        }
    }
 
    /**
     * Añade la calificacion en la posición del arreglo de calificaciones
     *
     * @param index indice del arreglo
     * @param calificacion calificacion de la materia
     */
    public void setCalificacion(int index, int calificacion) {
        calificaciones[index] = calificacion;
    }
 
    /**
     * Devuelve el promedio del estudiante. Si alguna de las notas del
     * estudiante no han sido seteadas entonces el promedio devolverá -1
     *
     * @return
     */
    public double getPromedio() {
        double promedio = -1;
        boolean error = false;
        int sumatoria = 0;
        for (int c : calificaciones) {
            if (c == -1) {
                error = true;
                break;
            } else {
                sumatoria += c;
            }
        }
        if (!error) {
            promedio = sumatoria / Double.valueOf(calificaciones.length);
        }
        return promedio;
    }
 
    @Override
    public String toString() {
        String s = "Nombre: " + nombre
                + "\nApellido: " + apellido
                + "\nCalificaciones: ";
        for (int i = 0; i < calificaciones.length; i++) {
            s += calificaciones[i] + (i + 1 < calificaciones.length ? ", " : "");
        }
        s += "\nPromedio: " + getPromedio();
        return s;
    }
 
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
 
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }
 
    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
 
    /**
     * @return the calificaciones
     */
    public int[] getCalificaciones() {
        return calificaciones;
    }
 
    /**
     * @param calificaciones the calificaciones to set
     */
    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }  
}

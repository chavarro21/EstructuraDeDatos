
package proyecto3;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;




public class inventory {
    private List<course> courses;
    
    public inventory (){
        this.courses = new LinkedList<> () ;
        
    }
    
    public void newCourse (String name,String description,int cap){
        course myCourse = new course(name, description, cap);
        String msn = courses.add(myCourse) ? "Se ha agregao el curso" : "No se agrego el curso";
        JOptionPane.showInternalMessageDialog(null, msn);
    }
    
    public void updateCourse (String name,String description,int cap){
        int CourseIndex = courses.indexOf(new course(name));
        course findCourse = courses.get(CourseIndex);
        findCourse.setDescpCourse(description);
        JOptionPane.showMessageDialog(null, "Se ha actualizado el elemento");
    }
    
    public void printCourses (){
        courses.forEach(System.out::println);
    }

    void removeCourse(String name, String descrition, int cap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void pollCourse(String name, String descrition, int cap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

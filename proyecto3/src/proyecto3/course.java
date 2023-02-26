
package proyecto3;

import java.util.Objects;

/**

 */
public class course {
    private String nameCourse;
    private String descpCourse;
    private int capacity;

    public course(String nameCourse, String descpCourse, int capacity) {
        this.nameCourse = nameCourse;
        this.descpCourse = descpCourse;
        this.capacity = capacity;
    }

    public course(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getDescpCourse() {
        return descpCourse;
    }

    public void setDescpCourse(String descpCourse) {
        this.descpCourse = descpCourse;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final course other = (course) obj;
        return Objects.equals(this.nameCourse, other.nameCourse);
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("course{");
        sb.append("nameCourse=").append(nameCourse);
        sb.append(", descpCourse=").append(descpCourse);
        sb.append(", capacity=").append(capacity);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}

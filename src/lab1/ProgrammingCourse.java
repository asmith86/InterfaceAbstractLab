/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;



/**
 *
 * @author asmith86
 */
public abstract class ProgrammingCourse {
   private String courseName;
   private String courseNumber;
    

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.isEmpty()) {
            throw new IllegalArgumentException("Illegal Name");
        }
        this.courseName = courseName;
    }

    public final void setCourseNumber(String courseNumber){
        if(courseNumber.isEmpty() || courseNumber.length() > 7){
            throw new IllegalArgumentException("Invalid course number!");
            
        } else {
            this.setCourseNumber(courseNumber);
        }
        
        
        
    }
       
    public abstract void setCredits(double credits); 

    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
        
        
    
    
    
}

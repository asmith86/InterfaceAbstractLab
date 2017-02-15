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
    private double credits;
    
    public ProgrammingCourse(String courseName, String courseNumber){
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public final String getCourseName() {
        return courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }
    
    

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Illegal Name");
        }
        this.courseName = courseName;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Invalid Number");
        }
        this.courseNumber = courseNumber;
    }

    

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Invalid number of credits");
        }
        this.credits = credits;
    }
        
    
    
    
}

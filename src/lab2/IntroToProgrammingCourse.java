package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements IProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

   

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.isEmpty() || courseNumber.length() > 6) {
            throw new IllegalArgumentException("Invalid Course Number.");
        }
        this.courseNumber = courseNumber;
    }

   
    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 2) {
            throw new IllegalArgumentException("Invalid number of credits.");
        }
        this.credits = credits;
    }

   

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.isEmpty()) {
            throw new IllegalArgumentException("Invalid Course Name");
        }
        this.courseName = courseName;
    }

    @Override
    public String getCourseName() {
        return this.courseName;
    }

    @Override
    public String getCourseNumber() {
       return this.courseNumber; 
    }

    @Override
    public double getCredits() {
        return this.credits;
    }

    
}

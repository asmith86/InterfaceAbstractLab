package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse implements IProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.isEmpty() || courseNumber.length() > 6) {
            throw new IllegalArgumentException("Invalid Intro to Java Course Number");
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public final void setCredits(double credits) {
        if(credits < 2.0 || credits > 3.0) {
            throw new IllegalArgumentException("Invalid number of credits");
        }
        this.credits = credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.isEmpty()) {
            throw new IllegalArgumentException("Invalid prerequisites for Intro to Java");
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.isEmpty()) {
            throw new IllegalArgumentException("Invalid name for Intro to Java");
        }
        this.courseName = courseName;
    }

    @Override
    public final String getCourseName() {
        return this.courseName;
    }

    @Override
    public final String getCourseNumber() {
        return this.courseNumber;
    }

    @Override
    public final double getCredits() {
        return this.credits;
    }

}

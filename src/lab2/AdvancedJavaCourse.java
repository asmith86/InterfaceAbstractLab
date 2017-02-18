package lab2;



/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse implements IProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    @Override
    public final String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.isEmpty() || courseNumber.length() > 6) {
            throw new IllegalArgumentException("Invalid Advanced Java Course Number");
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public final double getCredits() {
        return credits;
    }

    @Override
    public final void setCredits(double credits) {
        if(credits < 3.0 || credits > 4.0) {
            throw new IllegalArgumentException("Invalid number of credits");
        }
        this.credits = credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Invalid prerequisites for Advanced Java");
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public final String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Invalid Course Name for Advanced Java.");
        }
        this.courseName = courseName;
    }

   

    
}

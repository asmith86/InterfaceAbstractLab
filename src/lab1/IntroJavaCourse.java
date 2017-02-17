package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {
    private String courseNumber;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName);
        this.setCourseNumber(courseNumber);
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Invalid prerequisites");
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Invalid Number");
        }
        this.courseNumber = courseNumber;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }
    
    

}

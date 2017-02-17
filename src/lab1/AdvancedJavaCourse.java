package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {

    private String prerequisites;
    private String courseNumber;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName);
    }

    public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
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

    public String getCourseNumber() {
        return courseNumber;
    }

}

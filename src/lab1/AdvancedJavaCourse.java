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
    private double credits;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.isEmpty()) {
            throw new IllegalArgumentException("Invalid prerequisites for Advanced Java.");
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 2 || credits > 4) {
            throw new IllegalArgumentException("Invalid number of credits");
        } else {
            this.credits = credits;
        }

    }
}

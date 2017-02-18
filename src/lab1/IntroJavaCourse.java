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
    private double credits;

    public IntroJavaCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.isEmpty()) {
            throw new IllegalArgumentException("Invalid prerequisites for Intro to Java");
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public final void setCredits(double credits) {
        if(credits < 1 || credits > 3){
            throw new IllegalArgumentException("Invalid number of credits");
        } else {
            this.credits = credits;
        }
    }
   

   
    
    

}

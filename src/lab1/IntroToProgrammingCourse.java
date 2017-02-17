package lab1;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {
    private String courseNumber;
    
    
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName);
        this.setCourseNumber(courseNumber);
        
    }

   

    @Override
    public final void setCourseNumber(String courseNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    
    
}

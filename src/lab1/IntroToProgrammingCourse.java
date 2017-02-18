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
    private double credits;

    private enum Paradigm {
        PROCEDURAL, OBJECTORIENTED, FUNCTIONAL
    }
    private String paradigm;

    public IntroToProgrammingCourse(String courseName, String courseNumber,
            String paradigm, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setParadigm(paradigm);
        this.setCredits(credits);

    }

    private void setParadigm(String pString) {

        Paradigm p = Paradigm.valueOf(pString.replaceAll("\\s", "").toUpperCase());
        

        switch (p) {
            case PROCEDURAL:
                this.paradigm = "Procedural";
                break;
            case OBJECTORIENTED:
                this.paradigm = "Object-oriented";
                break;
            case FUNCTIONAL:
                this.paradigm = "Functional";
            default:
                throw new IllegalArgumentException("Invalid Paradigm");
           
        }
    }

    public final String getParadigm(){
        return this.paradigm;
    }
 

    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 2){
            throw new IllegalArgumentException("Invalid number of credits");
        } else {
            this.credits = credits;
        }
    }

}

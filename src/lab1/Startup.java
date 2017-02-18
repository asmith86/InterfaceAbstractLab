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
public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse introProg = new IntroToProgrammingCourse("Intro to programming", "029383", "object oriented", 1.0);
        ProgrammingCourse introJava = new IntroJavaCourse("Intro to Java", "83840", 2.0);
        ProgrammingCourse advJava = new AdvancedJavaCourse("Advanced Java", "84640", 4.0);
        
        /*
         * What I like about this design is that there are appropriate opportunities 
         * for code reuse that does not produce Excessive rigidity. The classes 
         * are similar enough where I feel that using an abstract class is appropriate, 
         * especially because there doesn't seem to be a need (at least to me) that
         * abstract methods need to be used, otherwise an Interface would be more suitable.
         */
        
        
        
        /*Using LSP is advantageous when you want to treat a collection of differing
         *classes polymorphically. LSP can potentially be disadvantageous when
         *you want to use the specific implementation code not found in super classes,
         *especially when you only are instantiating one object in the class heirarchy.
         */
        
        ProgrammingCourse[] progCourses = {
            introProg, introJava, advJava
            
        };
        
        for(ProgrammingCourse pc : progCourses){
            System.out.println(pc.getCourseName());
        }
    }
}

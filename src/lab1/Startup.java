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
        ProgrammingCourse introProg = new IntroToProgrammingCourse("Intro to programming", "029383");
        ProgrammingCourse introJava = new IntroJavaCourse("Intro to Java", "83840");
        ProgrammingCourse advJava = new AdvancedJavaCourse("Advanced Java", "84640");
        
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

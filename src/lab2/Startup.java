/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author asmith86
 */
public class Startup {

    public static void main(String[] args) {
        IProgrammingCourse introProg = new IntroToProgrammingCourse("Intro to programming", "029383");
        IProgrammingCourse introJava = new IntroJavaCourse("Intro to Java", "83840");
        IProgrammingCourse advJava = new AdvancedJavaCourse("Advanced Java", "84640");

        IProgrammingCourse[] progCourses = {
            introProg, introJava, advJava

        };

        for (IProgrammingCourse pc : progCourses) {
            System.out.println(pc.getCourseName());

        }

    }

}

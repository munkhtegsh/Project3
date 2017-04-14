/*------------------------------------------------------------------------
This is Course Registration programs that allow you to create classes, add or drop students and print out the class roster.
Description:This program contains four files,a student class,a course class, an alternative course class and the driver.
Student class is constructed with three parameters name(string), studentID(string) and tuitionPaid(boolean).It comes with setters and getters of each property,and it can be printed out in the form of studentID and student name.
Course class is constructed with two parameters name(string) and maxEnrollment(int) and one addition property roster that is an array of Student objects. Besides its setters and getters of both property, it also comes with a method to add student into the roster,a method to drop student from the roster, and a method to print out the roster.
CourseAL is an alternative way to write course class. It replace roster property by ArrayList.
Written by : Seonghoo Kim, Munkhtegsh Munkhbat, Marc Mares,Yongzheng He
Date       : Apr 7, 2017
--------------------------------------------------------------------------*/

/*
        1. creates six students
        2. creates a course that can hold five students
        3. prints the course
        4. prints the roster
        5. adds the first five students to the course
        6. tries to add the sixth student and prints a message if the add fails
        7. prints the roster
        8. drops the third student from the course
        9. prints the roster
        10. tries again to add the sixth student to the course (it should succeed this time)
        11. prints the roster
 */
public class Tester {
    public static void main(String[] args) {

        // 1. Six Student Creation
        Student Mark    = new Student("Mark Mares", "A146", true);
        Student Andrew  = new Student("Andrew Munkhtegsh", "A147", true);
        Student Eric    = new Student("Eric Yongzheng", "A148", true);
        Student Sam     = new Student("Sam Bowne", "A149", true);
        Student Jessica = new Student("Jessica Masters", "A150", true);
        Student Greg    = new Student("Gregory Boyd", "A151", true);

        // 2. Course Creation w/ Five Student Hold
        Course Physics  = new Course("Physics", 5);

        // 3. Print Course
        System.out.println(Physics);

        // 4. Print Roster
        Physics.printRoster();

        // 5. Add 5 students to course
        Physics.addStudent(Mark);
        Physics.addStudent(Andrew);
        Physics.addStudent(Eric);
        Physics.addStudent(Sam);
        Physics.addStudent(Jessica);

        // 6. Tries to add & fail
        Physics.addStudent(Greg);

        // 7. Prints Roster (Again)
        Physics.printRoster();

        // 8. Drop 3rd student
        Physics.dropStudent(Sam);

        // 9. Prints Roster (Again)
        Physics.printRoster();

        // 10. Tries to add (Again) and succeed
        Physics.addStudent(Greg);

        // 11. Prints Roster (Again)
        Physics.printRoster();
    }
}
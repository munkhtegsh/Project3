Part 1- The Student Class (10 points)
    Write a class called Student. A student is described by:
        a name
        an ID (text-based, such as "A146")
        whether or not tuition is paid
        Write a constructor, getters and setters, and a toString method for this class.

Part 2- The Course Class (10 points)
    Write a class called Course to represent a college class. A course is described by:
        a name
        the maximum students that can be enrolled in the course
        Write a constructor, getters and setters (validity checks), and a toString method.

Part 3- The Roster (10 points)
    Add a roster to the Course class. A roster is represented by an array of Student objects.
    Add instance data and code to the constructor to represent the roster.

Part 4- Course Methods (50 points)
    Write the following 3 methods in the Course class:
        public boolean addStudent(Student s)
            if there is room for the student and the student has paid their tuition,
            add the student to the roster and return true return false otherwise
        public boolean dropStudent(Student s)
            if the student is currently in the roster,
            remove them from the roster and return true return false otherwise
        public void printRoster()
            print how many students are enrolled in the course
            also print the list of each student on a single line
            (use good object-oriented principles to access a text representation of each student!)
            print an appropriate message if there are no students yet enrolled

Part 5- Driver Program (20 points)
    For this project, you will not write an interactive driver.
    Instead, you will write a driver to demonstrate that your class works.
    To do this, write a driver program that does the following (in this order):
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

Extra Credit (10 points)
    Write a class called CourseAL.
    This class has the same methods as Course.
    But, instead of using a Student[] to store the roster, use an ArrayList<Student>.
    Re-write the Course methods to work with the ArrayList.
    For full credit, take full advantage of the methods provided in the ArrayList class!
    If you complete the extra credit, submit both Course and CourseAL.

Notes and Submission
    You can add additional instance data variables or private, helper functions if necessary.
    If you include additional variables, include additional getters and setters as appropriate.
    For full credit, follow good principles of programming and object-oriented design.
    Use comments to provide brief explanations where appropriate.
    Include a brief comment in each class to summarize what the class represents.
    I have provided sample output of what your driver program might produce.
    I added comments to explain the output.
    Note that your output does not have to match this exactly in terms of wording, but the general output should be similar.
    To submit your program, zip your three .java files (or four with the extra credit) together and upload the zip file.
    If submitting as a group, submit one assignment only through one group member's Insight account.
    Put the names of all group members in Java comments at the top of each Java file.
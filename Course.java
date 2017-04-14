import java.util.Arrays;
import java.text.MessageFormat;

public class Course {

    private String name;
    private Student[] roster;
    private int maxEnrollment, currentEnrollment; // Added to count enrolled students
    private final int MAXCAPACITY = 1000; // unsure what max capacity should be; 1000 is just a placeholder
    private final int minEnrollment;

    //constructor
    public Course (String name, int maxEnrollment){
        this.name = name;
        this.minEnrollment = 1;
        this.maxEnrollment = maxEnrollment;
        this.currentEnrollment = 0;
        this.roster = new Student[maxEnrollment];
    }

    //getters
    public String getName(){ return this.name; }
    public int getMaxEnrollment(){ return this.maxEnrollment; }


    //setters
    public void setName(String newName) { this.name = newName; }
    public void setMaxEnrollment(int newMaxEnrollment) {
        if (newMaxEnrollment < minEnrollment){
            System.out.print(MessageFormat.format("Enrollment must be greater than {0} student!", minEnrollment));
        }
        else if (newMaxEnrollment > MAXCAPACITY){
            System.out.print(MessageFormat.format("Enrollment cannot be greater than {0} students.", MAXCAPACITY));
        }
        else{
            maxEnrollment = newMaxEnrollment;
        }
    }

    // addStudent method, receives student object and inserts to roster (= student array).
    public boolean addStudent(Student s) {
        boolean isStudentAdded = false;
        if (s.isTuitionPaid() && (currentEnrollment < maxEnrollment)) {
            // 'currentEnrollment' is always the next array index to be used.
            // ex) if 3 people enrolled, array index 0, 1, 2 is filled. Therefore next index is 3.
            roster[currentEnrollment++] = s; // After adding student, increase currentEnrollment by 1.
            isStudentAdded = true; // After adding student, boolean turns 'true'.
        } else {
            System.out.println("    ** Enrollment failed **");
            if (!s.isTuitionPaid())
                System.out.println("     └─ Unpaid tuition balance remain");
            if (currentEnrollment >= maxEnrollment) {
                System.out.println("     └─ Sorry, enrollment is full");
            }
            // Space is added after error message regardless of reason.
            System.out.println();
        }
        return isStudentAdded;
    }
// dropStudent method
    public boolean dropStudent(Student s){
      // iterating the array to check the index of target
      for(int i=0; i<currentEnrollment; i++){
        if(this.roster[i] == s){
          // once target found, rotate the array preventing empty slot in the middle
          for(int j=i;j<currentEnrollment;j++){
            if(j+1 == currentEnrollment){this.roster[j] = null;}
            else{this.roster[j] = this.roster[j+1];}
          }
          currentEnrollment--;
          return true;
        }
      }
      return false;

    }

    public void printRoster(){

        // print out the result and specify a case when no students enrolled
        if(this.currentEnrollment == 0){
          System.out.println("\n    ** No students enrolled **");
        } else {
          System.out.printf("Number of students enrolled: %d\n", this.currentEnrollment);
          for(int i = 0; i < currentEnrollment; i++){
            System.out.println(roster[i].toString());
          }
        }
        // Space is added after roster message regardless of enrolled or not
        System.out.println();
    }

    //String method
    public String toString(){
        return MessageFormat.format("Course: {0}\nEnrollment: {1}/{2}", name, currentEnrollment, maxEnrollment);
    }

}
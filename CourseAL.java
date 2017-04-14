import java.text.MessageFormat;
import java.util.ArrayList;

public class CourseAL {

    // Instance Data
    private String name;
    private ArrayList<Student> roster;
    private int minEnrollment, maxEnrollment, currentEnrollment; // Minimum enrollment will be inclusive

    // Class Constructor
    public CourseAL (String courseNameInput, int MaxEnrollmentInput){
        this.name = courseNameInput;
        this.minEnrollment = 5;
        this.maxEnrollment = MaxEnrollmentInput;
        this.currentEnrollment = 0;
        this.roster = new ArrayList<Student>(maxEnrollment);
    }

    // Getter Methods
    public String getName(){ return this.name; }
    public int getMaxEnrollment(){ return this.maxEnrollment; }

    // Setter Methods
    public void setName(String newName) { this.name = newName; }
    public void setMaxEnrollment(int MaxEnrollmentInput) {
        if (MaxEnrollmentInput < this.minEnrollment){
            System.out.print("Enrollment must be greater than " + this.minEnrollment + " student!");
        }
        else if (MaxEnrollmentInput > this.maxEnrollment){
            System.out.print("Enrollment cannot be greater than " + this.maxEnrollment + " students.");
        }
        else{
            this.maxEnrollment = MaxEnrollmentInput;
        }
    }



    // addStudent method, receives student object and inserts to roster.
    public boolean addStudent(Student s) {
        boolean isStudentAdded = false;
        if (s.isTuitionPaid() && (currentEnrollment < maxEnrollment)) {
            roster.add(s);
            currentEnrollment++;
            isStudentAdded = true; // After adding student, boolean turns 'true'.
        } else {
            System.out.println("** Enrollment failed **");
            if (!s.isTuitionPaid())
                System.out.println(" └─ Sorry, unpaid tuition balance remain");
            if (currentEnrollment >= maxEnrollment) {
                System.out.println(" └─ Sorry, enrollment is full");
            }
        }
        return isStudentAdded;
    }

	public boolean dropStudent(Student s){
		for(int i = 0; i < this.roster.size(); i++) 
		{
			if(s == this.roster.get(i)) 
			{
				this.roster.remove(i);
				currentEnrollment--;
				return true;
			} 	
		}
		return false;
	}
	
	public void printRoster() {

		if(this.roster.size() == 0) {
				System.out.println("There is no students enrolled yet");
			} else {
				System.out.println("Enrolled students number: " + this.roster.size());
				for(int i = 0; i < this.roster.size(); i++) {
					System.out.println(this.roster.get(i) + "\n ");
				}		
		}
}
    //String method
    public String toString(){
        return "Name: " + name + "\n" + "Enrollment: " + currentEnrollment + "/"+ maxEnrollment;
    }
}




public class Student {

    private String name;
    private String studentID;//iD is not a good idea, since ID has a meaning
    private boolean tuitionPaid;

    //constructor
    public Student (String initialName, String initialID, boolean initialTuitionPaid){
        name = initialName;
        studentID = initialID;
        tuitionPaid = initialTuitionPaid;
    }

    //getters
    public String getName(){
        return name;
    }

    public String getID(){
        return studentID;
    }

    public boolean isTuitionPaid(){
        return tuitionPaid;
    }

    //setters
    private void setName(String newName) {
        name = newName;
    }

    private void setID(String newID) {
        studentID = newID;
    }

    private void setTuitionPaid(boolean newTuitionPaid) {
        tuitionPaid = newTuitionPaid;

    }

    //String method
    public String toString(){
        return "Name: " + name + "\n" + "Student ID: " + studentID + "\n" + "Tuition Paid: " + tuitionPaid;
    }
}

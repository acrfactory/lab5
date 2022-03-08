package lab5;

public class Registration {
	// TODO: implement this class
    String title;
    int marks;
    String information;
    String[] grade = new String[2];
    Instructor instructor;

    Instructor i;
    public Registration(String title) {
        Instructor i = new Instructor();
        if (i.getName() == null){
            setTitle(title);
            setMarks(0);
            setInformation(title + " has not yet been assigned an instructor");
        } else {
            setTitle(title);
            setMarks(0);
            setInformation(title + " has not yet been assigned an instructor");
            setInformation(title + ", taught by " + i.getName() + ", is completed with raw marks "+ marks + " (" + grade[0] + " ; " + grade[1] + ")");
        }

    }
    public Registration(String title, Instructor i){
        setInstructor(i);
        if (i.getName() == null){
            setTitle(title);
            setMarks(0);
            setInformation(title + " has not yet been assigned an instructor");
        } else {
            setTitle(title);
            setMarks(0);
            setInformation(title + " has not yet been assigned an instructor");
            setInformation(title + ", taught by " + i.getName() + ", is completed with raw marks "+ marks + " (" + grade[0] + " ; " + grade[1] + ")");
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMarks(int marks) {
        if (90 <= marks && marks <= 100){
            grade[0] = "A+";
            grade[1] = "Exceptional";
        } else if (80 <= marks && marks <= 89){
            grade[0] = "A";
            grade[1] = "Excellent";
        } else if (70 <= marks && marks <= 79){
            grade[0] = "B";
            grade[1] = "Good";
        } else if (60 <= marks && marks <= 69){
            grade[0] = "C";
            grade[1] = "Competent";
        } else if (50 <= marks && marks <= 59) {
            grade[0] = "D";
            grade[1] = "Passing";
        } else {
            grade[0] = "F";
            grade[1] = "Failing";
        }
        this.marks = marks;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    public Instructor getInstructor() {
        this.i = instructor;
        return i;
    }

    public String getTitle() {
        return title;
    }

    public int getMarks() {
        return marks;
    }

    public String[] getGradeReport() {

        return grade;
    }

    public String getInformation() {
        if (instructor != null) {
            setInformation(title + ", taught by " + i.getName() + ", is completed with raw marks "+ marks + " (" + grade[0] + " ; " + grade[1] + ")");
        }
        return information;
    }
}
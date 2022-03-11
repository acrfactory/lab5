package lab5;

public class Test {
    public static void main(String[] args) {
        Instructor alan = new Instructor("A. Wassyng", 70130, "jackie@eecs.yorku.ca");
        Instructor mark = new Instructor("M. Lawford", 70139, "jonathan@yorku.ca");

        Participant suyeon = new Participant("S. Y. Lee");

        Registration[] suyeonRegistrations = suyeon.getRegistrations();
        String report = suyeon.getGPAReport();

        Registration r1 = new Registration("Intro. to OOP", alan);
        Registration r2 = new Registration("Intro. to OOP", alan);
        suyeon.addRegistration(r1);
        suyeon.addRegistration(r2);
        System.out.println(suyeon.getRegistrations().length);
        System.out.println(suyeon.registrationsList2[0]);
        System.out.println(suyeon.getRegistrations()[1]);
        System.out.println(r1);
        System.out.println(r2);
        suyeon.updateMarks("Intro. to OOP", 61);
        System.out.println(suyeon.getRegistrations()[0].getMarks());
    }


}

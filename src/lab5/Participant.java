package lab5;

import java.util.Arrays;

public class Participant {
	// TODO: implement this class

    String name;
    Registration[] registrationsList1 = new Registration[5];
    Registration[] registrationsList2 = new Registration[0];
    Registration[] dummy = new Registration[0];
    String gpaReport;
    int count = 0;

    public Participant (String name) {
        setName(name);
    }

    public Registration[] getRegistrations (){

            return registrationsList2;

    }

    public void addRegistration(Registration newRegi) {
        if(registrationsList2.length < 5 ) {
            Registration[] listCopy = registrationsList2;
            count++;
            this.registrationsList2 = new Registration[count];
            count--;
            this.registrationsList2[count] = newRegi;
            for (int i = 0; i < listCopy.length; i++) {
                registrationsList2[i] = listCopy[i];
            }
            count++;
            if (count == 5) {
                this.count = 0;
            }
        }
    }

    public void  addRegistration(String name) {
        if(registrationsList2.length < 5 ){
        Registration[] listCopy = registrationsList2;
        count++;
        this.registrationsList2 = new Registration[count];
        count--;
        this.registrationsList2[count] = new Registration(name);
        for (int i = 0; i < listCopy.length; i++) {

                registrationsList2[i] = listCopy[i];

        }
        count++;
        if (count == 5) {
            this.count = 0;
        }
        }
    }


    public void updateMarks(String title, int mark) {
        for (int i = 0; i < registrationsList2.length; i++) {
            if (registrationsList2[i].getTitle().equals(title)){
                registrationsList2[i].setMarks(mark);
            }
        }
    }
    public String getGPAReport() {
        double gpa;
        if (registrationsList2[0] == null || registrationsList2.length == 0) {
            gpaReport = "No GPA available yet for " + name;
        } else {
            gpaReport = name + "'s GPA of {";
            for(int i = 0; i < getMark().length-1; i++){
                gpaReport += getMark()[i] + ", ";
            }
            gpaReport += getMark()[getMark().length - 1] + "}";

            gpa = (double)getMarkSum()/registrationsList2.length;

            gpaReport += String.format(": %.1f", gpa);
        }
    return gpaReport;
    }

    private int getMarkSum() {
        int returnValue = 0;
        for (int i = 0; i < registrationsList2.length; i++) {
            String [] markString = registrationsList2[i].getGradeReport();

            switch (markString[0]) {
                case "A+" : returnValue += 9;
                    break;
                case "A" : returnValue += 8;
                    break;
                case "B" : returnValue += 7;
                    break;
                case "C" : returnValue += 6;
                    break;
                case "D" : returnValue += 5;
                    break;
                case "F" : returnValue += 0;
                    break;
            }
        }
    return returnValue;
    }


    private String[] getMark() {
        String[] returnValue = new String[registrationsList2.length];
        for (int i = 0; i < registrationsList2.length; i++) {
            String [] markString = registrationsList2[i].getGradeReport();

            switch (markString[0]) {
                case "A+" : returnValue[i] = "9 (A+)";
                break;
                case "A" : returnValue[i] = "8 (A)";
                break;
                case "B" : returnValue[i] = "7 (B)";
                break;
                case "C" : returnValue[i] = "6 (C)";
                break;
                case "D" : returnValue[i] = "5 (D)";
                break;
                case "F" : returnValue[i] = "0 (F)";
                break;
            }
        }
    return returnValue;
    }


        public int marksOf(String title) {
        int exist = -1;
        for (int i = 0; i < registrationsList2.length; i ++){
            if (registrationsList2.length == 0){
                exist = -1;
            }
            else if (title.equals(registrationsList2[i].getTitle()))
            {
                exist = registrationsList2[i].getMarks();
            }
        }
    return exist;
    }
    public void setName(String name) {

        this.name = name;

    }
    public String getName() {
        return this.name;
    }
    public void clearRegistrations() {
        registrationsList2 = new Registration[0];
        this.count = 0;
    }
}

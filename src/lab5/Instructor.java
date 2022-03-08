package lab5;

public class Instructor {
    // TODO: implement this class
    String name;
    int phoneExtension;
    String email;
    public  Instructor(){

    }
    public Instructor(String name, int phoneExtension, String email) {
        setName(name);
        setPhoneExtension(phoneExtension);
        setEmail(email);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneExtension(int campusPhone) {
        this.phoneExtension = campusPhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public int getPhoneExtension() {
        return this.phoneExtension;
    }

    public String getEmail() {
        return this.email;
    }

    public String getInformation() {
        return "Instructor " + name + " has campus phone extension " + phoneExtension + " and contact email " + email;
    }
}

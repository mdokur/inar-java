package week_11.assigments;

public class Student extends Person {
    private String classStatus;

    public Student(){
        super();

    }
    public Student(String name, String address, int phoneNumber , String email,  String classStatus){
        super.setName(name);
        super.setAddress(address);
        super.setPhoneNumber(phoneNumber);
        super.setEmail(email);
        this.classStatus = classStatus;
    }

    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }
    @Override
    public String toString(){
        return "     -Student-     " +
               "\nName: " + super.getName() +
               "\nAddress: " + super.getAddress() +
               "\nPhone Number: " + super.getPhoneNumber() +
               "\nEmail Address: " + super.getEmail() +
               "\nClass Status: " + this.classStatus;
    }
}

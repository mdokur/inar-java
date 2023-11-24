package week_11.assigments;

public class Staff extends Employee {
    private String title;

    public Staff() {

    }

    public Staff(String name, String address, int phoneNumber, String email,
                 double salary, String office, String title) {
        super.setName(name);
        super.setAddress(address);
        super.setPhoneNumber(phoneNumber);
        super.setEmail(email);
        super.setSalary(salary);
        super.setOffice(office);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString(){
        return "     -Staff-     " +
                "\nName: " + super.getName() +
                "\nAddress : " + super.getAddress() +
                "\nPhone Number: " + super.getPhoneNumber() +
                "\nEmail: " + super.getEmail() +
                "\nSalary: " + super.getSalary() +
                "\nOffice: " + super.getOffice() +
                "\nHired Date " + super.getDateHired() +
                "\nTitle: " + this.title;
    }
}

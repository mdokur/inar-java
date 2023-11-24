package week_11.assigments;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty() {

    }

    public Faculty(String name, String address, int phoneNumber, String email,
                   double salary, String office, String officeHours, String rank) {
        super.setName(name);
        super.setAddress(address);
        super.setPhoneNumber(phoneNumber);
        super.setEmail(email);
        super.setSalary(salary);
        super.setOffice(office);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "     -Faculty-     " +
                "\nName: " + super.getName() +
                "\nAddress : " + super.getAddress() +
                "\nPhone Number: " + super.getPhoneNumber() +
                "\nEmail: " + super.getEmail() +
                "\nSalary: " + super.getSalary() +
                "\nOffice: " + super.getOffice() +
                "\nHired Date " + super.getDateHired() +
                "\nOffice Hours: " + this.officeHours +
                "\nRank: " + this.rank;
    }
}

package week_11.assigments;

import week_10.assigments.MyDate;

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee() {
        dateHired = new MyDate();
    }

    public Employee(String name, String address, int phoneNumber, String email, double salary, String office) {
        super.setName(name);
        super.setAddress(address);
        super.setPhoneNumber(phoneNumber);
        super.setEmail(email);
        this.salary = salary;
        this.office = office;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "     -Employee-     " +
                "\nName: " + super.getName() +
                "\nAddress : " + super.getAddress() +
                "\nPhone Number: " + super.getPhoneNumber() +
                "\nEmail: " + super.getEmail() +
                "\nOffice : " + this.office +
                "\nSalary : " + this.salary +
                "\nHired Date:  " + this.dateHired;
    }
}

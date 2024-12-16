package f;

class Employee {
    String empName, empId, address, mailId;
    long mobileNo;

    Employee(String empName, String empId, String address, String mailId, long mobileNo) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Address: " + address);
        System.out.println("Email ID: " + mailId);
        System.out.println("Mobile Number: " + mobileNo);
    }
}

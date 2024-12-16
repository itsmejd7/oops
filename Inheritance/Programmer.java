package f;

class Programmer extends Employee {
    double basicPay;

    Programmer(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    void generatePaySlip() {
        double da = 0.97 * basicPay;      // Dearness Allowance
        double hra = 0.10 * basicPay;     // House Rent Allowance
        double pf = 0.12 * basicPay;      // Provident Fund
        double staffClub = 0.001 * basicPay; // Staff Club Fund
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - (pf + staffClub);

        System.out.println("\n--- Pay Slip (Programmer) ---");
        displayDetails();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}

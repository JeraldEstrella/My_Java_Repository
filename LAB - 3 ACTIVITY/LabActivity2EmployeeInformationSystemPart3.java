import java.util.Scanner;

class  LabActivity2EmployeeInformationSystemPart3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter your first name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(age < 18 || age >= 65){
            System.out.println((age >= 65) ? "Senior Citizens are not allowed" : "Minor is not allowed");
            return;
        }

        System.out.print("Enter your hours worked per day: ");
        double hoursWorked = scanner.nextDouble();

        if(hoursWorked <= 0 || hoursWorked > 24){
            System.out.println((hoursWorked > 24) ? "Number of hours worked cannot exceed 24 hours" : "Wrong input on daily work hours");
            return;
        };

        System.out.print("Enter your hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter role code: (1) Manager, (2) Supervisor, (3) Staff, (4) Intern: ");
        int position = scanner.nextInt();

        String role;

        switch (position){
            case 1: role = "Manager";
                break;
            case 2: role = "Supervisor";
                break;
            case 3: role = "Staff";
                break;
            case 4: role = "Intern";
                break;
            default: role = "Undefined";
        }

        // Computations (keeping precision)
        double dailyWage = hourlyWage * hoursWorked;
        double weeklySalary = dailyWage * 5;
        double monthlySalary = weeklySalary * 4;
        double grossYearlySalary = monthlySalary * 12;

        double governmentBenefits = 1500;
        double taxDeduction = (grossYearlySalary > 250000) ? (grossYearlySalary * 0.32) : 0;
        double netYearlyWage = grossYearlySalary - taxDeduction - governmentBenefits;

        // Output
        System.out.println("\nEmployee Information");
        System.out.println("---------------------");
        System.out.println("Full name: " + name.toUpperCase() + " " + lastName.toUpperCase());
        System.out.println("Age: " + age + " years old");
        System.out.println("Position: " + role);
        System.out.println("Years to Retirement: " + (65 - age) + " years");
        System.out.printf("Daily Salary: PHP %.2f\n", dailyWage);
        System.out.printf("Weekly Salary: PHP %.2f\n", weeklySalary);
        System.out.printf("Monthly Salary: PHP %.2f\n", monthlySalary);
        System.out.printf("Gross Yearly Salary: PHP %.2f\n", grossYearlySalary);
        System.out.printf("Net Yearly Salary: PHP %.2f\n", netYearlyWage);

        // Close Scanner
        scanner.close();
    }
}

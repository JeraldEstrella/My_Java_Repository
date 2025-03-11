import java.util.Scanner;

class  LabActivity2EmployeeInformationSystemPart2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter your first name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your hours worked per day: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter your hourly wage: ");
        double hourlyWage = scanner.nextDouble();

        // Computations (keeping precision)
        double dailyWage = hourlyWage * hoursWorked;
        double weeklySalary = dailyWage * 5;
        double monthlySalary = weeklySalary * 4;
        double grossYearlyWage = monthlySalary * 12;

        double governmentBenefits = 1500;
        double taxDeduction = grossYearlyWage * 0.32;
        double netYearlyWage = grossYearlyWage - governmentBenefits - taxDeduction;

        // Output
        System.out.println("\nEmployee Information");
        System.out.println("---------------------");
        System.out.println("Full name: " + name.toUpperCase() + " " + lastName.toUpperCase());
        System.out.println("Age: " + age + " years old");
        System.out.println("Years to Retirement: " + (65 - age) + " years");
        System.out.printf("Daily Salary: PHP %.2f\n", dailyWage);
        System.out.printf("Weekly Salary: PHP %.2f\n", weeklySalary);
        System.out.printf("Monthly Salary: PHP %.2f\n", monthlySalary);
        System.out.printf("Gross Yearly Salary: PHP %.2f\n", grossYearlyWage);
        System.out.printf("Net Yearly Salary: PHP %.2f\n", netYearlyWage);

        // Close Scanner
        scanner.close();
    }
}

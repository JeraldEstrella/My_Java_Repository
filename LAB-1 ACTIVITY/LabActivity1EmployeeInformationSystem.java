import java.util.Scanner;

public class LabActivity1EmployeeInformationSystem {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Hours Worked: ");
        float hoursWorked = scanner.nextFloat();

        System.out.print("Enter your Hourly Wage: ");
        float hourlyWage = scanner.nextFloat();

        // Calculate daily salary
        float dailySalary = hoursWorked * hourlyWage;

        System.out.println("\nEmployee Information");
        System.out.println("---------------------");
        System.out.println("Full Name : " + name + " " + lastName);
        System.out.println("Age : " + age + " Years Old"  );
        // Use printf(%.2f%n) to format dailySalary to 2 decimal places
        System.out.printf("Daily Salary: PHP %.2f", dailySalary);

        // Reference: https://www.w3schools.com/java/ref_output_printf.asp
        scanner.close();
    }

}

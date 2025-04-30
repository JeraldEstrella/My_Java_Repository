import java.util.ArrayList;
import java.util.Scanner;

public class MyMidtermLabExam {

   static ArrayList<String> ticket = new ArrayList<String>();
    static ArrayList<String> urgency = new ArrayList<String>();
    static ArrayList<String> pending = new ArrayList<String>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 5) {
            System.out.println("\n");
        System.out.println("*** IT Ticket System ***");
        System.out.println("1. Add Ticket");
        System.out.println("2. Update Ticket");
        System.out.println("3. Show All Ticket");
        System.out.println("4. Generate Report");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1:
                Addticket(scanner);
                break;
            case 2:
                updateTicket(scanner);
                break;
            case 3:
                showAllTicket(scanner);
                break;
            case 4:
                 generateReport(scanner);
                break;
            case 5:
                System.out.println("Exiting program...");
            default:
                System.out.println("Invalid number");
        }
        }
        scanner.close();
    }

    public static void Addticket(Scanner scanner){
        System.out.print("Enter issue description: ");
        String description = scanner.nextLine();
        System.out.print("Enter urgency level (low/ medium/ high): ");
        String urgencyLevel = scanner.nextLine();

        ticket.add(description);
        urgency.add(urgencyLevel);
        pending.add("Pending");

        System.out.println("Ticket Successfully added");
    }

    public static void updateTicket(Scanner scanner){

        System.out.println("\n" + "*** Update Ticket ***");
        showAllTicket(scanner);
        System.out.print("\n" + "Enter the ticket number to update: ");
        int ticketNumber = scanner.nextInt();
        scanner.nextLine();

     for(int i = 0; i < ticket.size(); i++){
        if(i == ticketNumber - 1){
            System.out.println("\n");
            System.out.print("Enter new status (In Progess / Resolved): ");

            String status = scanner.nextLine();

            pending.set(i, status);
            System.out.println("Ticket Status Updated.");
            showAllTicket(scanner);
        }
     }
    }

    public static void generateReport(Scanner scanner){
        System.out.println("\n" + "*** Ticket Report ***");
        int pendingCount = 0;
        int Resolved = 0;

        for(int i = 0; i < ticket.size(); i++){
            String status = pending.get(i);
            
         if(status.equalsIgnoreCase("Resolved")){
            Resolved++;
         }
         else if(status.equalsIgnoreCase("Pending") || status.equalsIgnoreCase("In Progress")){
            pendingCount++;
         }
    }
        System.out.println("Total tickets: " + ticket.size());
        System.out.println("Pending tickets: " + pendingCount);
        System.out.println("Resolved tickets: " + Resolved);
    }

    public static void showAllTicket(Scanner scanner){
        System.out.println("\n");
        System.out.println("*** All Ticket ***");
        for(int i = 0; i < ticket.size(); i++){
            String urgencyLevel = urgency.get(i);
            String description = ticket.get(i);
            String status = pending.get(i);

             System.out.println((i + 1) + ". [" + urgencyLevel.toUpperCase() + "] " + description + "-" + "Status - " + status);
        }
    }
}
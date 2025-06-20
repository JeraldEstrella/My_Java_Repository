# IT Ticket Management System - Java Console Application

## Description
This Java console application provides a simple IT Ticket Management System that allows users to:
- Create new support tickets
- Update ticket statuses
- View all tickets
- Generate reports on ticket statistics

## Features

### Core Functionality
- **Ticket Creation**:
  - Add tickets with descriptions
  - Set urgency levels (low/medium/high)
  - Default status set to "Pending"

- **Ticket Management**:
  - Update ticket status (In Progress/Resolved)
  - View all tickets with their details
  - Track urgency levels and current status

- **Reporting**:
  - Generate summary reports showing:
    - Total ticket count
    - Number of pending tickets
    - Number of resolved tickets

### Technical Implementation
- Uses ArrayLists for dynamic storage of:
  - Ticket descriptions
  - Urgency levels
  - Status updates
- Menu-driven console interface
- Input validation for menu selections
- Case-insensitive status comparisons

## How to Use

1. Compile the program:
   ```bash
   javac MyMidtermLabExam.java
   ```

2. Run the application:
   ```bash
   java MyMidtermLabExam
   ```

3. Use the menu system:
   ```
   *** IT Ticket System ***
   1. Add Ticket
   2. Update Ticket
   3. Show All Ticket
   4. Generate Report
   5. Exit
   ```

## Menu Options

### 1. Add Ticket
- Enter issue description
- Set urgency level (low/medium/high)
- Ticket automatically marked as "Pending"

### 2. Update Ticket
- View all tickets with numbers
- Select ticket to update by number
- Change status to "In Progress" or "Resolved"

### 3. Show All Tickets
- Displays all tickets with:
  - Ticket number
  - Urgency level (in uppercase)
  - Description
  - Current status

### 4. Generate Report
- Shows statistics:
  - Total tickets created
  - Pending/In Progress tickets
  - Resolved tickets

### 5. Exit
- Closes the application

## Example Usage

```
*** IT Ticket System ***
1. Add Ticket
2. Update Ticket
3. Show All Ticket
4. Generate Report
5. Exit
Enter your choice: 1
Enter issue description: Printer not working
Enter urgency level (low/medium/high): medium
Ticket Successfully added
```

## Technical Notes
- Uses `ArrayList` for dynamic storage
- Implements basic console I/O with `Scanner`
- Simple menu navigation with `switch` statement
- No persistent storage (data lost when program exits)

## Future Enhancements
- Add ticket categories/priorities
- Implement search/filter functionality
- Add date tracking for tickets
- Include user authentication
- Add persistent data storage
- Implement email notifications

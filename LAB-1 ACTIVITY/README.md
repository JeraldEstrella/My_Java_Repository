# Employee Information System - Java Console Application

## Description
This Java console application collects basic employee information and calculates their daily salary based on hours worked and hourly wage.

## Features
- Collects employee personal information:
  - First name
  - Last name
  - Age
- Captures work details:
  - Hours worked
  - Hourly wage
- Calculates and displays:
  - Daily salary (hours worked × hourly wage)
- Formatted output with 2 decimal places for currency values

## How to Use
1. Compile the Java file:
   ```
   javac LabActivity1EmployeeInformationSystem.java
   ```
2. Run the compiled program:
   ```
   java LabActivity1EmployeeInformationSystem
   ```
3. Follow the on-screen prompts to enter employee information

## Input Requirements
1. First name (string)
2. Last name (string)
3. Age (integer)
4. Hours worked (float)
5. Hourly wage (float)

## Output Details
The program displays:
- Employee's full name (first + last)
- Age
- Daily salary formatted to 2 decimal places with PHP currency indicator

## Technical Notes
- Uses `Scanner` class for console input
- Implements `printf` with `%.2f` format specifier for currency formatting
- Basic console application with no input validation
- Simple arithmetic calculation for salary

## Example Usage
```
Enter your first name: Juan
Enter your last name: Dela Cruz
Enter your age: 30
Enter Hours Worked: 8.5
Enter your Hourly Wage: 250.75

Employee Information
---------------------
Full Name : Juan Dela Cruz
Age : 30 Years Old
Daily Salary: PHP 2131.38
```

## Future Enhancements
- Input validation
- Additional salary calculations (weekly, monthly)
- Tax calculations
- Position/role differentiation

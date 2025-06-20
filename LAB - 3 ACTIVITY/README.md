# Employee Information System (Part 3) - Java Program

## Description
This Java program is an Employee Information System that collects and processes employee data to calculate various salary metrics. It handles user input validation and provides detailed output about the employee's compensation.

## Features
- Collects employee personal information (name, age)
- Validates age (must be between 18-64)
- Tracks work details (hours worked, hourly wage)
- Supports different role codes (Manager, Supervisor, Staff, Intern)
- Calculates:
  - Daily, weekly, monthly, and yearly salaries
  - Tax deductions (32% for salaries over PHP 250,000)
  - Government benefits (fixed PHP 1500 deduction)
  - Years until retirement (65 years)
- Provides formatted output of all employee information

## Input Requirements
1. First name (string)
2. Last name (string)
3. Age (integer, 18-64)
4. Hours worked per day (double, 0-24)
5. Hourly wage (double)
6. Role code (integer 1-4):
   - 1: Manager
   - 2: Supervisor
   - 3: Staff
   - 4: Intern

## Error Handling
- Rejects minors (age < 18)
- Rejects senior citizens (age ≥ 65)
- Validates work hours (must be 0-24)
- Handles invalid role codes (marks as "Undefined")

## Output Details
The program displays:
- Employee's full name (formatted as LASTNAME, FIRSTNAME)
- Age and position
- Years until retirement
- Salary breakdown (daily, weekly, monthly)
- Gross and net yearly salary (after tax and benefits)

## How to Run
1. Compile the Java file:
   ```
   javac LabActivity2EmployeeInformationSystemPart3.java
   ```
2. Run the compiled program:
   ```
   java LabActivity2EmployeeInformationSystemPart3
   ```
3. Follow the on-screen prompts to enter employee information

## Notes
- All monetary values are displayed in PHP (Philippine Peso)
- Calculations assume:
  - 5 working days per week
  - 52 working weeks per year
  - Fixed government benefits deduction of PHP 1500
  - 32% tax rate for salaries over PHP 250,000

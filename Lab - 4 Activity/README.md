# Employee Information System - Java AWT GUI Application

## Description
This Java application provides a graphical user interface (GUI) for an Employee Information System using AWT (Abstract Window Toolkit). It collects employee details and calculates their daily salary based on hours worked and hourly rate.

## Features
- **User-friendly GUI** with input fields for:
  - First name
  - Last name
  - Age
  - Hours worked
  - Hourly rate
- **Input validation** for:
  - Required fields
  - Name format (letters only)
  - Age format (integer)
  - Numeric values for hours and rate
- **Salary calculation** (hours worked × hourly rate)
- **Output display** showing:
  - Full name
  - Age
  - Calculated salary
- **Error handling** with descriptive messages

## How to Use
1. Compile the Java file:
   ```
   javac LabActivity4EmpInfoSystemGUI.java
   ```
2. Run the compiled program:
   ```
   java LabActivity4EmpInfoSystemGUI
   ```
3. Fill in all fields in the form
4. Click "Submit" button to see results

## Input Requirements
- **First Name**: Alphabetic characters only (required)
- **Last Name**: Alphabetic characters only (required)
- **Age**: Whole number (required)
- **Hours Worked**: Numeric value (required)
- **Rate per Hour**: Numeric value (required)

## Technical Details
- Built using Java AWT components:
  - `Frame` for main window
  - `Panel` for organizing components
  - `Label`, `TextField`, `TextArea` for input/output
  - `Button` with `ActionListener` for submission
- Input validation using:
  - Empty field checks
  - Regular expressions for name validation
  - Number parsing with error handling
- Window closing handler for proper application exit

## Screenshot
(Would include an image of the GUI here in a real README)

## Example Usage
1. Enter valid information in all fields:
   ```
   First Name: John
   Last Name: Smith
   Age: 30
   Hours Worked: 8.5
   Rate per Hour: 250.75
   ```
2. Click "Submit"
3. Output displays:
   ```
   Full Name: John Smith
   Age: 30 Years Old
   Salary: PHP 2131.38
   ```

## Limitations
- Uses absolute positioning (null layout)
- Basic AWT components (no Swing enhancements)
- No persistence of data
- Simple salary calculation only

## Future Enhancements
- Add Swing components for better UI
- Implement data persistence
- Add more salary calculations (weekly, monthly)
- Include tax calculations
- Add position/role differentiation

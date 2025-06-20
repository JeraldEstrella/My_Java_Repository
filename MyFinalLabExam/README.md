# Scientific Calculator - Java Swing Application

## Description
This Java Swing application is a full-featured scientific calculator with advanced mathematical capabilities. It features a clean, modern interface with rounded buttons and supports complex calculations including exponents, square roots, and percentage operations.

## Features

### Core Functionality
- **Basic Operations**: Addition, subtraction, multiplication, division
- **Scientific Functions**:
  - Exponentiation (x^y)
  - Square roots (√)
  - Percentage calculations (%)
- **Special Operations**:
  - Sign toggle (+/-)
  - Decimal input
  - Backspace functionality

### Advanced Features
- **Precision Calculations**: Uses BigDecimal for high-precision arithmetic
- **Smart Formatting**:
  - Automatic scientific notation for large/small numbers
  - Trailing zero removal
  - Adaptive font sizing for display
- **Error Handling**: Graceful handling of invalid operations
- **Memory Functions**: Implicit memory of last result

### User Interface
- **Modern Design**: Rounded buttons with hover/press effects
- **Dual Display**: Shows both current expression and result
- **Responsive Layout**: Adapts to different screen sizes
- **Visual Feedback**: Button press animations

## How to Use

1. Compile and run the program:
   ```bash
   javac FinalLabProjectCalculator.java
   java FinalLabProjectCalculator
   ```

2. Calculator Operations:
   - **Numbers**: Click 0-9 to input digits
   - **Operators**: +, -, *, / for basic arithmetic
   - **Scientific**:
     - √ for square roots
     - ^ for exponents
     - % for percentages
   - **Functions**:
     - C to clear
     - ← to backspace
     - +/- to toggle sign
     - = to calculate result

## Technical Implementation

### Key Components
- **BigDecimal Arithmetic**: For precise decimal calculations
- **Custom Components**: RoundedButton class with visual effects
- **Expression Parser**: Handles complex mathematical expressions
- **Smart Formatting**: Adaptive display of results

### Architecture
- **MVC Pattern**: 
  - Model: Expression evaluation logic
  - View: Swing GUI components
  - Controller: Action listeners
- **State Management**: Tracks decimal points, operators, etc.

## Example Calculations

1. Basic Arithmetic:
   ```
   5 + 3 * 2 = 11
   ```

2. Scientific Operations:
   ```
   4 ^ 3 = 64
   √25 = 5
   50 + 20% = 60
   ```

3. Complex Expressions:
   ```
   2 + √(9) * 3^2 = 29
   ```

## Requirements
- Java Runtime Environment (JRE) 8 or later
- No external dependencies

## Future Enhancements
- Additional scientific functions (sin, cos, log, etc.)
- Memory storage (M+, M-, MR, MC)
- History of calculations
- Theme customization
- Keyboard support

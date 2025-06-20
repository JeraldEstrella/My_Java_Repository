# Quiz Application - Java AWT GUI

## Description
This Java AWT application is a simple quiz program that presents multiple-choice questions to users and tracks their score. The application features a clean graphical interface and demonstrates object-oriented programming principles.

## Features

### Quiz Functionality
- Presents multiple-choice questions one at a time
- Tracks user score throughout the quiz
- Provides immediate feedback at the end
- Prevents skipping questions without answering

### Technical Implementation
- Uses AWT components (Frame, Label, Checkbox, Button)
- Implements ActionListener for button events
- Object-oriented design with Question class
- Array-based question storage
- Radio button behavior using CheckboxGroup

### User Interface
- Clear question display
- Organized answer options
- Error messaging for unanswered questions
- Final score display

## How to Use

1. Compile the program:
   ```bash
   javac LabActivity5QuizAppAWT.java
   ```

2. Run the application:
   ```bash
   java LabActivity5QuizAppAWT
   ```

3. Interact with the quiz:
   - Read each question carefully
   - Select one answer using the radio buttons
   - Click "Next" to proceed
   - View your final score after the last question

## Code Structure

### Main Components
- `Question` class: Stores question text, options, and correct answer
- `quiz` array: Contains all quiz questions and answers
- GUI elements: Labels, checkboxes, and buttons for interaction

### Key Methods
- `loadQuestion()`: Displays questions and options
- `actionPerformed()`: Handles button clicks and scoring
- Window listener for proper application exit

## Customization

To modify the quiz:
1. Edit the `quiz` array to add/change questions:
   ```java
   new Question("Question text", 
               new String[]{"Option A", "Option B", "Option C", "Option D"},
               correctIndex) // 0-3
   ```
2. Adjust the GUI layout by modifying component properties
3. Change fonts/colors in the constructor

## Example Question Format
```java
new Question("What does HTML stand for?", 
            new String[] {
                "A. Hyper Trainer Marking Language", 
                "B. HyperText Markup Language",
                "C. Hyper Text Markdown Language", 
                "D. None of the above"
            }, 
            1) // Correct answer is B (index 1)
```

## Requirements
- Java Runtime Environment (JRE)
- No external dependencies (uses standard AWT library)

## Limitations
- Fixed set of questions (no dynamic loading)
- Basic AWT interface (no modern UI elements)
- No question randomization
- No persistent score tracking

## Future Enhancements
- Add timer for each question
- Implement question categories
- Add difficulty levels
- Include image support for questions
- Add database integration for question storage

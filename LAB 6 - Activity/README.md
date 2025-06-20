# To-Do List Application - Java Swing

## Description
This Java Swing application is a simple To-Do List manager that allows users to:
- Add new tasks with names, descriptions, and statuses
- View all tasks in a table format
- Track task progress with status indicators

## Features
- **User-friendly GUI** built with Java Swing
- **Task Management**:
  - Add new tasks with name and description
  - Set task status (Pending, In Progress, Completed)
- **Table View** of all tasks with columns for:
  - Task Name
  - Task Description
  - Status
- **Input Validation** to ensure required fields are filled
- **Responsive Design** with scrollable task list

## How to Use
1. **Launch the application**:
   ```
   java LabActivity6SwingToDoList
   ```
2. **Main Window**:
   - Displays all tasks in a table
   - "Add Task" button opens the task creation dialog

3. **Adding a Task**:
   - Click "Add Task" button
   - Fill in:
     - Task Name (required)
     - Task Description (optional)
     - Select Status from dropdown (required)
   - Click "Save Task" to add to the list

## Technical Details
- Built using Java Swing components:
  - `JFrame` for main window
  - `JTable` with `DefaultTableModel` for task display
  - `JComboBox` for status selection
  - Input validation with `JOptionPane` error messages
- Follows MVC-like pattern with:
  - `Task` class as model
  - Swing components as view
  - Action listeners as controller

## Requirements
- Java Runtime Environment (JRE) 8 or later
- No external dependencies - uses standard Java Swing libraries

## Screenshots
(Would include images of the application interface here in a real README)

## Known Limitations
- No persistence (tasks are lost when application closes)
- No edit/delete functionality for existing tasks
- Basic error handling

## Future Enhancements
- Save/Load functionality
- Task editing/deletion
- Due dates and priorities
- Categories/tags for tasks


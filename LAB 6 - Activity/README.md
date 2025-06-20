# To-Do List Application - Java Swing GUI

## Description
This Java Swing application is a graphical task management system that allows users to create, view, and update tasks with different status levels. It demonstrates intermediate Java GUI development skills using Swing components.

## Features

### Core Functionality
- **Task Management**:
  - Add new tasks with descriptions
  - Set task status (Pending/In Progress/Completed)
  - View all tasks in a table format
  - Update task statuses

### Technical Implementation
- Uses Swing components:
  - `JFrame` for main window
  - `JTable` with `DefaultTableModel` for task display
  - `JComboBox` for status selection
- Object-oriented design with `Task` class
- Input validation with `JOptionPane` error messages

## How to Use

1. **Compile and Run**:
   ```bash
   javac LabActivity6SwingToDoList.java
   java LabActivity6SwingToDoList
   ```

2. **Main Window**:
   - Displays all tasks in a table
   - "Add Task" button opens creation dialog

3. **Adding a Task**:
   - Click "Add Task" button
   - Fill in:
     - Task Name (required)
     - Task Description (optional)
     - Select Status from dropdown (required)
   - Click "Save Task" to add to list

## Code Structure

### Main Components
- `Task` class: Stores task name, description, and status
- `DefaultTableModel`: Manages data for the task table
- Action listeners for button events

### Key Methods
- `actionPerformed()`: Handles button clicks
- Dialog window creation for task input
- Table updates when adding/modifying tasks

## Example Usage

1. Add a new task:
   ```
   Task Name: Complete project
   Description: Finish the Java assignment
   Status: Pending
   ```

2. Update status later:
   - Select task in table
   - Change status to "In Progress" or "Completed"

## Requirements
- Java Runtime Environment (JRE) 8 or later
- Swing libraries (included in standard Java)

## Future Enhancements
- Task categories/tags
- Due dates and priorities
- Data persistence (save/load tasks)
- Search/filter functionality
- Task deletion option


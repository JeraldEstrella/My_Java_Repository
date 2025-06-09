import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class LabActivity6SwingToDoList extends JFrame implements ActionListener {
    JPanel buttonPanel;
    JButton AddButton;
    JTable taskTable;
    JLabel errorLabel;
    DefaultTableModel tableModel;

    String[] columnNames = {"Task Name", "Task Description", "Status"};

    public static class Task {
        String name;
        String description;
        String status;

        public Task(String name, String description, String status) {
            this.name = name;
            this.description = description;
            this.status = status;
        }
    }

    public LabActivity6SwingToDoList() {
        setTitle("To-Do List Viewer");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // add task panel
        buttonPanel = new JPanel(); 
        AddButton = new JButton("Add Task");
        AddButton.setBackground(Color.BLUE);
        AddButton.addActionListener(this);
        buttonPanel.add(AddButton);

        add(buttonPanel, BorderLayout.NORTH);

        // task table panel
        JPanel taskPanel = new JPanel(new BorderLayout());
        tableModel = new DefaultTableModel(columnNames, 0);
        taskTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(taskTable);
        taskPanel.add(scrollPane, BorderLayout.CENTER);
        add(taskPanel, BorderLayout.CENTER);
    }

    // Action listener for the "Add Task" button and to open the add task dialog
    @Override
    public void actionPerformed(ActionEvent e) {

        JFrame addTaskFrame = new JFrame("Add Task");
        addTaskFrame.setSize(320, 280);
        addTaskFrame.setLayout(new BorderLayout());

        if (addTaskFrame.isShowing()) {
            addTaskFrame.toFront();
            addTaskFrame.requestFocus();
            return;
        }

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 1, 1, 1));
        inputPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

        JLabel nameLabel = new JLabel("Task Name:");
        JTextField nameField = new JTextField();

        JLabel descriptionLabel = new JLabel("Task Description:");
        JTextArea descriptionField = new JTextArea();

        JLabel statusLabel = new JLabel("Status:");
        String[] statuses = {"Pending", "In Progress", "Completed"};
        JComboBox<String> statusComboBox = new JComboBox<>(statuses);

        // Add components to inputPanel
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(descriptionLabel);
        inputPanel.add(descriptionField);
        inputPanel.add(statusLabel);
        inputPanel.add(statusComboBox);

        // Add button to add task
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Save Task");
        addButton.setFont(new Font("Arial", Font.BOLD, 10));
        addButton.setBackground(Color.GREEN);
        addButton.setForeground(Color.WHITE);
        buttonPanel.add(addButton);

        // Action listener for the "Save Task" button
        addButton.addActionListener(_ -> {
            if (nameField.getText().trim().isEmpty() || statusComboBox.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(addTaskFrame, "Fill in Task Name and Status", "input error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            tableModel.addRow(new Object[]{
                nameField.getText(),
                descriptionField.getText(),
                statusComboBox.getSelectedItem()
            });
            addTaskFrame.dispose();
        });

        addTaskFrame.add(inputPanel, BorderLayout.NORTH); 
        addTaskFrame.add(buttonPanel, BorderLayout.SOUTH);

        addTaskFrame.setLocationRelativeTo(this);
        addTaskFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LabActivity6SwingToDoList().setVisible(true));
    }
}

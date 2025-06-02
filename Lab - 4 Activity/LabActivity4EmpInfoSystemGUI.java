import java.awt.*;
import java.awt.event.*;

public class LabActivity4EmpInfoSystemGUI {

    public static void main(String[] args) {
        Frame frame = new Frame("Laboratory Activity 4");

        Panel panel = new Panel();
        panel.setLayout(null);

        Panel outPanel = new Panel();
        outPanel.setLayout(null);
        outPanel.setBounds(0, 300, 400, 200);

        Label nameLabel = new Label("First Name");
        TextField nametextField = new TextField(20);

        TextField lastNameTextfield = new TextField(20);
        Label lastNameLabel = new Label("Last Name");

        Label AgeLabel = new Label("Age");
        TextField ageTextfield = new TextField(20);

        Label hoursWorkedLabel = new Label("Hours Worked");
        TextField hoursTextfield = new TextField(20);

        Label rateLabel = new Label("Rate per Hour");
        TextField rateTextfield = new TextField(20);

        nameLabel.setBounds(10, 20, 80, 25);
        nametextField.setBounds(100, 20, 250, 25);

        lastNameLabel.setBounds(10, 60, 80, 25);
        lastNameTextfield.setBounds(100, 60, 250, 25);

        AgeLabel.setBounds(10, 100, 80, 25);
        ageTextfield.setBounds(100, 100, 250, 25);

        hoursWorkedLabel.setBounds(10, 140, 80, 25);
        hoursTextfield.setBounds(100, 140, 250, 25);

        rateLabel.setBounds(10, 180, 80, 25);
        rateTextfield.setBounds(100, 180, 250, 25);

        Button button = new Button("Submit");
        button.setBounds(150, 230, 80, 60);

        panel.add(nameLabel);
        panel.add(nametextField);
        panel.add(lastNameLabel);
        panel.add(lastNameTextfield);
        panel.add(AgeLabel);
        panel.add(ageTextfield);
        panel.add(hoursWorkedLabel);
        panel.add(hoursTextfield);
        panel.add(rateLabel);
        panel.add(rateTextfield);
        panel.add(button);

        Label outLabel = new Label("Output");
        TextArea outputTextfield = new TextArea();

        outLabel.setBounds(10, 10, 80, 25);
        outputTextfield.setBounds(10, 50, 350, 100);

        outPanel.add(outLabel);
        outPanel.add(outputTextfield);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstname = nametextField.getText().trim();
                String lastname = lastNameTextfield.getText().trim();
                String age = ageTextfield.getText().trim();
                String hours = hoursTextfield.getText().trim();
                String rate = rateTextfield.getText().trim();

                if (firstname.isEmpty() || lastname.isEmpty() || age.isEmpty() || hours.isEmpty() || rate.isEmpty()) {
                    outputTextfield.setText("Error: All fields must be filled.");
                    return;
                }

                if (!firstname.matches("[a-zA-Z]+") || !lastname.matches("[a-zA-Z]+")) {
                    outputTextfield.setText("Error: Names should only contain letters.");
                    return;
                }

                if (!age.matches("\\d+")) {
                    outputTextfield.setText("Error: Age must be a valid integer.");
                    return;
                }

                float hoursfloat;
                float ratefloat;

                try {
                    hoursfloat = Float.parseFloat(hours);
                    ratefloat = Float.parseFloat(rate);
                } catch (NumberFormatException ex) {
                    outputTextfield.setText("Error: Hours worked and Rate must be numeric values.");
                    return;
                }

                float salary = hoursfloat * ratefloat;

                outputTextfield.setText(
                        "Full Name: " + firstname + " " + lastname + "\n" +
                        "Age: " + age + " Years Old\n" +
                        "Salary: PHP " + salary
                );
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.add(outPanel, BorderLayout.SOUTH);

        frame.setSize(400, 700);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose();
            }
        });
    }
          }

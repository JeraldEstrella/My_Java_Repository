import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabActivity5QuizAppSwing extends JFrame implements ActionListener {
    JLabel questionLabel;
    JRadioButton[] options = new JRadioButton[4];
    ButtonGroup optionsGroup;
    JButton nextButton;

    public static class Question {
        String questionText;
        String[] optionsText;
        int answerIndex;

        public Question(String questionText, String[] optionsText, int answerIndex) {
            this.questionText = questionText;
            this.optionsText = optionsText;
            this.answerIndex = answerIndex;
        }
    }

    int currentQuestion = 0;
    int score = 0;

    Question[] quiz = {
        new Question("What does CPU stand for?", new String[] {
            "A. Central Process Unit", "B. Central Processing Unit", 
            "C. Computer Personal Unit", "D. Central Processor Utility"
        }, 1),

        new Question("Which language is used to create Android apps?", new String[] {
            "A. Python", "B. Java", "C. Swift", "D. C#"
        }, 1),

        new Question("What does HTML stand for?", new String[] {
            "A. Hyper Trainer Marking Language", "B. HyperText Markup Language",
            "C. Hyper Text Markdown Language", "D. None of the above"
        }, 1)
    };

    public LabActivity5QuizAppSwing() {
        setTitle("Quiz App");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //question label
        questionLabel = new JLabel("", JLabel.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(questionLabel, BorderLayout.NORTH);

        //options panel
        JPanel optionsPanel = new JPanel(new GridLayout(2, 2));
        optionsGroup = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            options[i] = new JRadioButton();
            options[i].setFont(new Font("Arial", Font.PLAIN, 14));
            options[i].setForeground(Color.BLUE);
            optionsGroup.add(options[i]);
            optionsPanel.add(options[i]);
        }
        add(optionsPanel, BorderLayout.CENTER);

        //button panel
        JPanel buttonPanel = new JPanel(new BorderLayout());
        nextButton = new JButton("Next");
        nextButton.addActionListener(this);
        buttonPanel.add(nextButton, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Load the first question
        loadQuestion(currentQuestion);
    }

    // Method to load a question based on the index
    public void loadQuestion(int questionIndex) {
        if (questionIndex < quiz.length) {
            questionLabel.setText(quiz[questionIndex].questionText);
            for (int i = 0; i < options.length; i++) {
                options[i].setText(quiz[questionIndex].optionsText[i]);
            }
            optionsGroup.clearSelection();
        }
    }

    // Action listener for the next button based on the index
    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedOption = -1;
        for (int i = 0; i < options.length; i++) {
            if (options[i].isSelected()) {
                selectedOption = i;
                break;
            }
        }
        if (selectedOption == -1) {
            JOptionPane.showMessageDialog(this, "Please select an answer.");
            return;
        }
        if (selectedOption == quiz[currentQuestion].answerIndex) {
            score++;
        }

        currentQuestion++;
        if (currentQuestion < quiz.length) {
            loadQuestion(currentQuestion);
        } else {
            questionLabel.setText("Quiz completed! Your score: " + score + "/" + quiz.length);
            nextButton.setEnabled(false);
            for (JRadioButton option : options) {
                option.setEnabled(false);
            }
        }
    }

    // Main method to run the quiz application
    public static void main(String[] args) {
        new LabActivity5QuizAppSwing().setVisible(true);
    }
}

// With the help of GitHub Copilot, I implemented the use of a public class (Question)
// and stored quiz data in a Question[] array. This structure allows for flexible
// handling of multiple questions and answers in a clean, organized way.

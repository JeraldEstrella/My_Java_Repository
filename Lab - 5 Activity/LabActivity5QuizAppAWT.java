import java.awt.*;
import java.awt.event.*;

public class LabActivity5QuizAppAWT extends Frame implements ActionListener {
    Label questionLabel;
    Checkbox[] options = new Checkbox[4];
    CheckboxGroup optionsGroup;
    Button nextButton;
    Label errorLabel;

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

    public LabActivity5QuizAppAWT() {
        setTitle("Quiz App");
        setSize(500, 300);
        setLayout(new BorderLayout());

        // question label
        questionLabel = new Label("", Label.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(questionLabel, BorderLayout.NORTH);

        // options panel
        Panel optionsPanel = new Panel(new GridLayout(2, 2));
        optionsGroup = new CheckboxGroup();
        for (int i = 0; i < 4; i++) {
            options[i] = new Checkbox("", optionsGroup, false);
            options[i].setFont(new Font("Arial", Font.PLAIN, 14));
            options[i].setForeground(Color.BLUE);
            optionsPanel.add(options[i]);
        }
        add(optionsPanel, BorderLayout.CENTER);

        // button panel
        Panel buttonPanel = new Panel(new BorderLayout());
        errorLabel = new Label("", Label.CENTER);
        errorLabel.setFont(new Font("Arial", Font.PLAIN, 11));
        buttonPanel.add(errorLabel, BorderLayout.NORTH);

        nextButton = new Button("Next");
        nextButton.addActionListener(this);
        buttonPanel.add(nextButton, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Load first question
        loadQuestion(currentQuestion);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void loadQuestion(int questionIndex) {
        if (questionIndex < quiz.length) {
            questionLabel.setText(quiz[questionIndex].questionText);
            for (int i = 0; i < options.length; i++) {
                options[i].setLabel(quiz[questionIndex].optionsText[i]);
                options[i].setState(false);
            }
               optionsGroup.setSelectedCheckbox(null);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedOption = -1;
        for (int i = 0; i < options.length; i++) {
            if (options[i].getState()) {
                selectedOption = i;
                break;
            }
        }
        if (selectedOption == -1) {
            errorLabel.setText("Please select an answer.");
            return;
        }
        if (selectedOption == quiz[currentQuestion].answerIndex) {
            score++;
            currentQuestion++;
            errorLabel.setText(""); 
        }

        if (currentQuestion < quiz.length) {
            loadQuestion(currentQuestion);
        } else {
            questionLabel.setText("Quiz completed! Your score: " + score + "/" + quiz.length);
            for (Checkbox option : options) {
                option.setEnabled(false);
            }
            nextButton.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        new LabActivity5QuizAppAWT().setVisible(true);
    }
}
   


// With the help of GitHub Copilot, I implemented the use of a public class (Question)
// and stored quiz data in a Question[] array. This structure allows for flexible
// handling of multiple questions and answers in a clean, organized way.

package QuizTime;

import java.util.ArrayList;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class QuizTimeQuiz {

	private JFrame frame;
	private JTextField txtYourAnswerHere;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizTimeQuiz window = new QuizTimeQuiz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QuizTimeQuiz() {
		initialize();
	}

	/**
	 * Create the questions.
	 */
	private ArrayList questions() {
		Question one = new Question("Hello", "_____ is it me your looking for");
		Question two = new Question ("Arizona", "Standing on the corner in Winslow _____");
		Question three = new Question ("2", "2 + 2 = ______");
		
		ArrayList<Question> questions = new ArrayList<Question>();
		questions.add(one);
		questions.add(two);
		questions.add(three);
		
		return questions;
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 820, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtYourAnswerHere = new JTextField();
		txtYourAnswerHere.setText("Your Answer Here");
		frame.getContentPane().add(txtYourAnswerHere, BorderLayout.WEST);
		txtYourAnswerHere.setColumns(10);
		String newQuestion = questions().get(0);
		JLabel lblQuestionTextGoes = new JLabel(newQuestion);
		frame.getContentPane().add(lblQuestionTextGoes, BorderLayout.SOUTH);
	}

}

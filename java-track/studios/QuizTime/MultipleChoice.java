package QuizTime;

public class MultipleChoice extends Question{
	
	private String [] multAnswers= new String [4];
	
	public MultipleChoice(String answer, String qText, String [] multAnswers) {
		super(answer, qText);
		this.multAnswers= multAnswers;
	}
}
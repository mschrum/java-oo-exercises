package QuizTime;

public class Question {
	protected String answer;
	protected boolean isCorrect;
	protected String qText;
	protected String submittedAnswer;
	
	public Question (String answer, String qText) {
		this.answer=answer;
		this.qText=qText;
		this.isCorrect=false;
		this.submittedAnswer="";
		
	}

	public boolean getIsCorrect() {
		return isCorrect;
	}
	
	public String getqText() {
		return qText;
	}
	public String getSubmittedAnswer() {
		return submittedAnswer;
	}
	
	public void submitAnswer(String submittedAnswer) {
		this.submittedAnswer=submittedAnswer;
	}

	public void checkCorrect() {
		if (this.submittedAnswer.equals(this.answer)){
			this.isCorrect = true;
		}
		else {
			this.isCorrect=false;
		}

	}

	public String getAnswer() {
		return answer;
	}
}

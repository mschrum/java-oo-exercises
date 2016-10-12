package QuizTime;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuizTest {

	@Test
	public void testCheckQuestionCorrect() {
		Question q = new Question ("Hello", "______ is it me you're looking for");
		q.submitAnswer("Hello");
		q.checkCorrect();
		assertTrue ("Problem checking correct answer", q.getIsCorrect());
		q.submitAnswer("Goodbye");
		q.checkCorrect();
		assertFalse ("Problem checking false answer", q.getIsCorrect());
		
	}
	
	public void testCheckMultQuestionCorrect() {
		String [] possibleAnswers = {"Hello","Goodbye", "Help", "Run"};
		MultipleChoice q = new MultipleChoice ("Hello", "______ is it me you're looking for", possibleAnswers);
		q.submitAnswer(possibleAnswers[0]);
		q.checkCorrect();
		assertTrue ("Problem checking correct answer", q.getIsCorrect());
		q.submitAnswer(possibleAnswers[3]);
		q.checkCorrect();
		assertFalse ("Problem checking false answer", q.getIsCorrect());
		
	}

}

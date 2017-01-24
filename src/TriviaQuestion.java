import java.util.*;

/**
 *
 * @author Amanda
 */
public class TriviaQuestion {
    public String question; // trivia question
    public String button; //assigns an answer button value to correct answer
    public ArrayList <String> answers; //answer options for each trivia question
    int points = 0, questionNumber; 
    
    public TriviaQuestion (String question, String button, int questionNumber){
        this.question = question;
        this.button = button;
        this.questionNumber = questionNumber;
    }
    public void answers (String ans1, String ans2, String ans3, String ans4){
        answers = new ArrayList<> ();
        String a1 = ans1;
        String a2 = ans2;
        String a3 = ans3;
        String a4 = ans4;
        
        answers.add(a1);
        answers.add(a2);
        answers.add(a3);
        answers.add(a4);
    }
}

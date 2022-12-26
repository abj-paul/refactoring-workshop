import java.util.*;

public abstract class Question extends Player implements ITriviaGame{
    public static final int QUESTION_COUNT = 50;

    private LinkedList<String> popQuestions = new LinkedList<String>();
    private LinkedList<String> scienceQuestions = new LinkedList<String>();
    private LinkedList<String> sportsQuestions = new LinkedList<String>();
    private LinkedList<String> rockQuestions = new LinkedList<String>();

    protected void createQuestion(int questionCount){
	for (int i = 0; i < questionCount; i++) {
            popQuestions.addLast(createPopQuestion(i));
            scienceQuestions.addLast(createScienceQuestion(i));
            sportsQuestions.addLast(createSportsQuestion(i));
            rockQuestions.addLast(createRockQuestion(i));
        }
    }
    private String createPopQuestion(int index){
	return "Pop Question " + index;
    }
    private String createScienceQuestion(int index){
	return "Science Question " + index;
    }
    private String createSportsQuestion(int index){
	return "Sports Question " + index;
    }

    private String createRockQuestion(int index) {
        return "Rock Question " + index;
    }


    protected void askQuestion() {
        if (currentCategory() == "Pop")
	    IAnnounce.announce(popQuestions.removeFirst());
        if (currentCategory() == "Science")
	    IAnnounce.announce(scienceQuestions.removeFirst());
        if (currentCategory() == "Sports")
	    IAnnounce.announce(sportsQuestions.removeFirst());
        if (currentCategory() == "Rock")
	    IAnnounce.announce(rockQuestions.removeFirst());
    }


    
    public void announceWrongAnswer(){
	IAnnounce.announce("Question was incorrectly answered");
	IAnnounce.announce(getPlayer(getCurrentPlayer()) + " was sent to the penalty box");
    }


    protected abstract boolean wrongAnswer();
    protected abstract boolean wasCorrectlyAnswered();
    protected abstract boolean correctAnswerEvent();
    protected abstract void getRoundQuestion(int roll);



    protected String currentCategory() {
        if (places[getCurrentPlayer()] == 0) return "Pop";
        if (places[getCurrentPlayer()] == 4) return "Pop";
        if (places[getCurrentPlayer()] == 8) return "Pop";
        if (places[getCurrentPlayer()] == 1) return "Science";
        if (places[getCurrentPlayer()] == 5) return "Science";
        if (places[getCurrentPlayer()] == 9) return "Science";
        if (places[getCurrentPlayer()] == 2) return "Sports";
        if (places[getCurrentPlayer()] == 6) return "Sports";
        if (places[getCurrentPlayer()] == 10) return "Sports";
        return "Rock";
    }
}


import java.util.*;

public abstract class Question extends Player implements IPenaltyBox, ITriviaGame{
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
	    Announcement.announce(popQuestions.removeFirst());
        if (currentCategory() == "Science")
	    Announcement.announce(scienceQuestions.removeFirst());
        if (currentCategory() == "Sports")
	    Announcement.announce(sportsQuestions.removeFirst());
        if (currentCategory() == "Rock")
	    Announcement.announce(rockQuestions.removeFirst());
    }

    protected boolean wrongAnswer() {
	announceWrongAnswer();
	sendPlayerToPenaltyBox(getCurrentPlayer());
	gotoNextPlayer();
        return true;
    }

    public boolean wasCorrectlyAnswered() {
        if (playerInPenaltyBox(getCurrentPlayer())) {
            if (isGettingOutOfPenaltyBox()) return correctAnswerEvent();
            else {
		gotoNextPlayer();
                return true;
            }
        } else return correctAnswerEvent();
    }

    @Override
    protected void announceWrongAnswer(){
	Announcement.announce("Question was incorrectly answered");
	Announcement.announce(players.get(getCurrentPlayer()) + " was sent to the penalty box");
    }


    private boolean correctAnswerEvent(){
	Announcement.announce("Answer was correct!!!!");
	purses[getCurrentPlayer()]++;
	Announcement.announce(players.get(getCurrentPlayer())
		 + " now has "
	      + purses[getCurrentPlayer()]
		 + " Gold Coins.");

	gotoNextPlayer();
	return didPlayerWin();
    }


    protected void getRoundQuestion(int roll){
	getNewPlaceBasedOn(roll);
	
	Announcement.announce("The category is " + currentCategory());
	askQuestion();
    }

    private String currentCategory() {
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


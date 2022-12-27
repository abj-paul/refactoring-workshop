
public abstract class RollDice extends Penalty{
    protected void rejoinGame(int roll){
	getOutOfPenalty();
	getRoundQuestion(roll);
    }

    protected void roll(int roll) {
	announceRoll(getCurrentPlayer(), roll);
	
        if(playerInPenaltyBox(getCurrentPlayer())){
            if (oddRoll(roll)) rejoinGame(roll);
            else waitInPenaltyBox();
        }
	else getRoundQuestion(roll);
    }

    private boolean oddRoll(int roll){
	return roll % 2 != 0;
    }
    public void announceRoll(int playerIndex, int roll){
	IAnnounce.announce(players.get(playerIndex) + " is the current player");
	IAnnounce.announce("They have rolled a " + roll);
    }

    @Override
    protected boolean wrongAnswer() {
	announceWrongAnswer();
	sendPlayerToPenaltyBox(getCurrentPlayer());
	gotoNextPlayer();
        return true;
    }

    @Override
    protected boolean wasCorrectlyAnswered() {
	if (!playerInPenaltyBox(getCurrentPlayer()))
		gotoNextPlayer();
         else return correctAnswerEvent();
    }

    @Override
    protected boolean correctAnswerEvent(){
	IAnnounce.announce("Answer was correct!!!!");
	purses[getCurrentPlayer()]++;
	IAnnounce.announce(players.get(getCurrentPlayer())
		 + " now has "
	      + purses[getCurrentPlayer()]
		 + " Gold Coins.");

	gotoNextPlayer();
	return didPlayerWin();
    }
    @Override
    protected void getRoundQuestion(int roll){
	getNewPlaceBasedOn(roll);
	
	IAnnounce.announce("The category is " + currentCategory());
	askQuestion();
    }

}

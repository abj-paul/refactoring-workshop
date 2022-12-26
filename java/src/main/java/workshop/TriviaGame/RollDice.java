
public abstract class RollDice extends PenaltyBox implements IRoll{
    public void rejoinGame(int roll){
	getOutOfPenalty();
	getRoundQuestion(roll);
    }


    public void roll(int roll) {
	announceRoll(getCurrentPlayer(), roll);
	
        if (playerInPenaltyBox(getCurrentPlayer())){
            if (oddRoll(roll)) rejoinGame(roll);
            else waitInPenaltyBox();
        }
	else getRoundQuestion(roll);
    }

    public boolean oddRoll(int roll){
	return roll % 2 != 0;
    }
    @Override
    protected void announceRoll(int playerIndex, int roll){
	Announcement.announce(players.get(playerIndex) + " is the current player");
	Announcement.announce("They have rolled a " + roll);
    }

}

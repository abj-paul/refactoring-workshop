
public abstract class Penalty extends Question implements IPenalty{
    public boolean playerInPenaltyBox(int playerIndex){
	    return inPenaltyBox[playerIndex];
    }
    public void getOutOfPenalty(){
	setGettingOutOfPenaltyBox(true);
	IAnnounce.announce(players.get(getCurrentPlayer()) + " is getting out of the penalty box");
    }
    
    public void getNewPlaceBasedOn(int roll){
        places[getCurrentPlayer()] = places[getCurrentPlayer()] + roll;
	if (places[getCurrentPlayer()] > 11) places[getCurrentPlayer()] = places[getCurrentPlayer()] - 12;
	
	IAnnounce.announce(players.get(getCurrentPlayer())
		 + "'s new location is "
			      + places[getCurrentPlayer()]);
    }

    public void waitInPenaltyBox(){
	IAnnounce.announce(players.get(getCurrentPlayer()) + " is not getting out of the penalty box");
	setGettingOutOfPenaltyBox(false);
    }

    public void sendPlayerToPenaltyBox(int playerIndex){
        inPenaltyBox[playerIndex] = true;
    }

}


public abstract class PenaltyBox extends Question implements IPenaltyBox {
    public boolean playerInPenaltyBox(int playerIndex){
	    return inPenaltyBox[playerIndex];
    }
    public void getOutOfPenalty(){
	setGettingOutOfPenaltyBox(true);
	Announcement.announce(players.get(getCurrentPlayer()) + " is getting out of the penalty box");
    }
    
    public void getNewPlaceBasedOn(int roll){
        places[getCurrentPlayer()] = places[getCurrentPlayer()] + roll;
	if (places[getCurrentPlayer()] > 11) places[getCurrentPlayer()] = places[getCurrentPlayer()] - 12;
	
	Announcement.announce(players.get(getCurrentPlayer())
		 + "'s new location is "
			      + places[getCurrentPlayer()]);
    }

    public void waitInPenaltyBox(){
	Announcement.announce(players.get(getCurrentPlayer()) + " is not getting out of the penalty box");
	setGettingOutOfPenaltyBox(false);
    }

    public void sendPlayerToPenaltyBox(int playerIndex){
        inPenaltyBox[playerIndex] = true;
    }

}

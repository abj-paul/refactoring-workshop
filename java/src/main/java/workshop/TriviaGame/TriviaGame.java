import java.util.ArrayList;
import java.util.LinkedList;


public class TriviaGame extends RollDice implements ITriviaGame{
    int currentPlayer;
    boolean gettingOutOfPenaltyBox;

    TriviaGame(){
	this.currentPlayer = 0;
    }

    public void gotoNextPlayer(){
	currentPlayer++;
	if (currentPlayer == players.size()) currentPlayer = 0;
    }

    public boolean didPlayerWin() {
        return !(purses[currentPlayer] == 6);
    }

    public int getCurrentPlayer(){
	return this.currentPlayer;
    }

    public boolean isGettingOutOfPenaltyBox(){
	return gettingOutOfPenaltyBox==true;
    }

    public void setGettingOutOfPenaltyBox(boolean value){
	gettingOutOfPenaltyBox=value;
    }


}


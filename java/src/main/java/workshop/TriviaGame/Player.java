import java.util.ArrayList;

public abstract class Player extends Announcement{
    ArrayList<String> players = new ArrayList<String>();
    int[] places = new int[6];
    int[] purses = new int[6];
    boolean[] inPenaltyBox = new boolean[6];

    protected boolean add(String playerName) {
	initializeNewPlayerInfo(playerName);
	announcePlayerAddition(playerName);
        return true;
    }

    private void initializeNewPlayerInfo(String playerName){
	players.add(playerName);
        places[howManyPlayers()] = 0;
        purses[howManyPlayers()] = 0;
        inPenaltyBox[howManyPlayers()] = false;
    }


    protected int howManyPlayers() {
        return players.size();
    }   

    protected void announcePlayerAddition(String playerName){
	Announcement.announce(playerName + " was added");
        Announcement.announce("They are player number " + players.size());
    }

}

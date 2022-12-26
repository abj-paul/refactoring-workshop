import java.util.ArrayList;

public abstract class Player implements IPlayer {
    protected ArrayList<String> players = new ArrayList<String>();
    protected int[] places = new int[6];
    protected int[] purses = new int[6];
    protected boolean[] inPenaltyBox = new boolean[6];

    protected boolean add(String playerName) {
	initializeNewPlayerInfo(playerName);
	announcePlayerAddition(playerName);
        return true;
    }

    public String getPlayer(int index){
	return players.get(index);
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

    public void announcePlayerAddition(String playerName){
	IAnnounce.announce(playerName + " was added");
        IAnnounce.announce("They are player number " + players.size());
    }

}

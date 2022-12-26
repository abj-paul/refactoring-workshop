interface ITriviaGame{
    void gotoNextPlayer();
    int getCurrentPlayer();
    boolean didPlayerWin();
    boolean isGettingOutOfPenaltyBox();
    void setGettingOutOfPenaltyBox(boolean value);
    boolean isPlayable(int totalPlayerCount);
}




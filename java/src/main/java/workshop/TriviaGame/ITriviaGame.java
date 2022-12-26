interface ITriviaGame{
    int getCurrentPlayer();
    void setGettingOutOfPenaltyBox(boolean value);
    boolean isGettingOutOfPenaltyBox();
    void gotoNextPlayer();
    boolean didPlayerWin() ;
}




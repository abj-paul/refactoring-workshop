interface IPenaltyBox{
    void sendPlayerToPenaltyBox(int playerIndex);
    void waitInPenaltyBox();
    boolean playerInPenaltyBox(int playerIndex);
    void getOutOfPenalty();
    void getNewPlaceBasedOn(int roll);
}

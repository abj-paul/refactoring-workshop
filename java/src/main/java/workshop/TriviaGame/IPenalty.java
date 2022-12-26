interface IPenalty{
    void getNewPlaceBasedOn(int roll);
    void getOutOfPenalty();
    boolean playerInPenaltyBox(int playerIndex);
    void waitInPenaltyBox();
    void sendPlayerToPenaltyBox(int playerIndex);
}

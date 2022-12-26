
interface IAnnounce {
    public static void announce(Object message){
        System.out.println(message);
    }
    void announceRoll(int playerIndex, int roll);
    void announceWrongAnswer();
    void announcePlayerAddition(String playerName);
}

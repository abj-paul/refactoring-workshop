public abstract class Announcement implements ITriviaGame{
    
    public static void announce(Object message) {
        System.out.println(message);
    }

    protected abstract void announceRoll(int playerIndex, int roll);
    protected abstract void announceWrongAnswer();
    protected abstract void announcePlayerAddition(String playerName);
}

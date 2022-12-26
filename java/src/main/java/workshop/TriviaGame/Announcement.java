public abstract class Announcement implements IAnnounce{
    protected abstract void announceRoll(int playerIndex, int roll);
    protected abstract void announceWrongAnswer();
    protected abstract void announcePlayerAddition(String playerName);
}

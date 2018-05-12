package game.messages;

/**
 * 数あてゲームのメッセージ
 */
public class GuessGameMessages implements Messages {
    @Override
    public String welcome() {
        return "Welcome to the guessing game, my secret number is between 1 and 100";
    }

    @Override
    public String done() {
        return "Correct";
    }
}

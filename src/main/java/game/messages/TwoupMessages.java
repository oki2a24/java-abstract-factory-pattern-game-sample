package game.messages;

/**
 * ツーアップゲームのメッセージ
 */
public class TwoupMessages implements Messages {
    @Override
    public String welcome() {
        return "Welcome to the twoup game, you start with $1000";
    }

    @Override
    public String done() {
        return "Sorry, you have no money left, goodbye";
    }
}

package game.messages;

/**
 * メッセージインターフェース
 */
public interface Messages {
    /**
     * ゲーム開始時のメッセージを返します。
     * @return ゲーム開始時のメッセージ
     */
    String welcome();

    /**
     * ゲーム終了時のメッセージを返します。
     * @return ゲーム終了時のメッセージ
     */
    String done();
}

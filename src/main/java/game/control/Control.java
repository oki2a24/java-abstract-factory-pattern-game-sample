package game.control;

/**
 * ゲーム進行係インターフェース
 */
public interface Control {

    /**
     * ゲームを続行するかどうか判定します。
     * @return 続行する場合は true、そうでない場合は false
     */
    boolean moreTurns();

    /**
     * ゲームを実行します。
     * @param input 入力
     */
    void play(Integer input);
}

package game.inputconverter;

/**
 * 入力変換機インターフェース
 */
public interface InputConverter {

    /**
     * 入力の型を変換します。
     * @param input 入力
     * @return 変換後の入力
     */
    Integer convert(String input);
}

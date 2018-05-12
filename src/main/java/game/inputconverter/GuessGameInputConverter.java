package game.inputconverter;

/**
 * 数あてゲームの入力変換機
 */
public class GuessGameInputConverter implements InputConverter {
    @Override
    public Integer convert(String input) {
        return Integer.valueOf(input);
    }
}

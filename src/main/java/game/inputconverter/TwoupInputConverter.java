package game.inputconverter;

/**
 * ツーアップゲームの入力変換機
 */
public class TwoupInputConverter implements InputConverter {
    @Override
    public Integer convert(String input) {
        return Integer.valueOf(input);
    }
}

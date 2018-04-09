package game.inputconverter;

public class GuessGameInputConverter implements InputConverter {
    @Override
    public Integer convert(String input) {
        return Integer.valueOf(input);
    }
}

package game.inputconverter;

public class TwoupInputConverter implements InputConverter {
    @Override
    public Integer convert(String input) {
        return Integer.valueOf(input);
    }
}

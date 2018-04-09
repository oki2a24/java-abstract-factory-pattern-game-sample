import game.GameFactory;
import game.control.Control;
import game.inputconverter.InputConverter;
import game.messages.Messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        //GameFactory g = GameFactory.valueOf("TWOUP");
        GameFactory g = GameFactory.valueOf("GUESS");
        Messages messages = g.getMessages();
        Control control = g.getControl();
        InputConverter inputConverter = g.getInputConverter();

        System.out.println(messages.welcome());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (control.moreTurns()) {
            String input = reader.readLine().trim();
            control.play(inputConverter.convert(input));
        }
        System.out.println(messages.done());
    }
}

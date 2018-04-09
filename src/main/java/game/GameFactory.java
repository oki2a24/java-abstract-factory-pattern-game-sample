package game;

import game.control.Control;
import game.control.GuessGameControl;
import game.control.TwoupControl;
import game.inputconverter.GuessGameInputConverter;
import game.inputconverter.InputConverter;
import game.inputconverter.TwoupInputConverter;
import game.messages.GuessGameMessages;
import game.messages.Messages;
import game.messages.TwoupMessages;

public enum GameFactory {
    GUESS(new GuessGameMessages(), new GuessGameInputConverter(), new GuessGameControl()),
    TWOUP(new TwoupMessages(), new TwoupInputConverter(), new TwoupControl());

    private Messages messages;
    private InputConverter inputConverter;
    private Control control;

    GameFactory(Messages messages, InputConverter inputConverter, Control control) {
        this.messages = messages;
        this.inputConverter = inputConverter;
        this.control = control;
    }

    public Messages getMessages() {
        return this.messages;
    }

    public InputConverter getInputConverter() {
        return this.inputConverter;
    }

    public Control getControl() {
        return this.control;
    }
}

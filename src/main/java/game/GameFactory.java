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

/**
 * ゲームファクトリクラス
 *
 * Abstract Factory パターンの親 Factory クラスの役割、
 * つまり、ファクトリの抽象クラス (またはインターフェース) の役割を持ちます。
 * したがって、本クラスに各ファクトリクラス実装の持つインスタンス取得メソッドを定義します。
 *
 * また、通常の親 Factory クラスと異なり、各実装 Factory クラスの登録が必要です。
 * 本クラスは enum のため、enum 定数として、各実装 Factory クラスを登録します。
 * これにより、親 Factory クラスと実装 Factory クラスが密に繋がってしまいますが、
 * 各実装 Factory クラスの定義が不要となります。
 */
public enum GameFactory {
    /** 数あてゲームファクトリ */
    GUESS(new GuessGameMessages(), new GuessGameInputConverter(), new GuessGameControl()),
    /** ツーアップゲームファクトリ */
    TWOUP(new TwoupMessages(), new TwoupInputConverter(), new TwoupControl());

    /** メッセージ */
    private Messages messages;
    /** 入力変換機 */
    private InputConverter inputConverter;
    /** ゲーム進行係 */
    private Control control;

    /**
     * コンストラクタ
     * @param messages メッセージ
     * @param inputConverter 入力変換機
     * @param control ゲーム進行係
     */
    GameFactory(Messages messages, InputConverter inputConverter, Control control) {
        this.messages = messages;
        this.inputConverter = inputConverter;
        this.control = control;
    }

    /**
     * メッセージインスタンスを取得します。
     * @return メッセージ
     */
    public Messages getMessages() {
        return this.messages;
    }

    /**
     * 入力変換機インスタンスを取得します。
     * @return 入力変換機
     */
    public InputConverter getInputConverter() {
        return this.inputConverter;
    }

    /**
     * ゲーム進行係インスタンスを取得します。
     * @return ゲーム進行係
     */
    public Control getControl() {
        return this.control;
    }
}

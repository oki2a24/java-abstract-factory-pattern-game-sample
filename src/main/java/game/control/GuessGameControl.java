package game.control;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * 数あてゲームのゲーム進行係
 */
public class GuessGameControl implements Control {

    /** 数あてゲームの最小値 */
    private Integer lower = 1;

    /** 数あてゲームの最小値 */
    private Integer upper = 100;

    /** 数あてゲームの正解の値 */
    private Integer guess = new Random().nextInt(upper - lower) + lower;

    @Override
    public boolean moreTurns() {
        boolean done = (lower == guess || upper == guess);
        if (!done) {
            System.out.println(String.format("Enter a number between %s and %s", lower, upper));
        }

        return !done;
    }

    @Override
    public void play(Integer nextGuess) {
        if (nextGuess <= guess) {
            lower = Arrays.asList(lower, nextGuess).stream()
                    .max(Comparator.naturalOrder())
                    .orElseThrow(() -> new IllegalArgumentException("不正な入力です"));
        }
        if (nextGuess >= guess) {
            upper = Arrays.asList(upper, nextGuess).stream()
                    .min(Comparator.naturalOrder())
                    .orElseThrow(() -> new IllegalArgumentException("不正な入力です"));
        }
    }
}

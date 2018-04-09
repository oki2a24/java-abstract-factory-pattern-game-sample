package game.control;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class GuessGameControl implements Control {
    private Integer lower = 1;
    private Integer upper = 100;
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

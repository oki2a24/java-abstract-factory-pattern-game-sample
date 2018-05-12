package game.control;

import java.util.Random;

/**
 * ツーアップゲームのゲーム進行係
 */
public class TwoupControl implements Control {
    private Integer money = Integer.valueOf(1000);
    private Random random = new Random();

    @Override
    public boolean moreTurns() {
        if (money > 0) {
            System.out.println(String.format("You have %s, how much would you like to bet?", money));
            return true;
        }
        return false;
    }

    @Override
    public void play(Integer amount) {
        boolean coin1 = tossWasHead();
        boolean coin2 = tossWasHead();
        if (coin1 && coin2) {
            money += amount;
            System.out.println("You win");
        } else if (!coin1 && !coin2) {
            money -= amount;
            System.out.println("You lose");
        } else {
            System.out.println("Draw");
        }
    }

    /**
     * コインを投げた結果を返します。
     * @return コインが表の場合は true、裏の場合は false
     */
    private boolean tossWasHead() {
        Integer next = random.nextInt();
        return (next % 2 == 0);
    }
}

package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Consumer {

    private static final int MIN_AMOUNT = 1000;

    private final List<Lotto> lottos = new ArrayList<>();
    private final int buyAmount;

    public Consumer(int buyAmount) {
        validate(buyAmount);
        this.buyAmount = buyAmount;
    }

    private static void validate(int buyAmount) {
        buyAmountLessThan1000(buyAmount);
    }

    private static void buyAmountLessThan1000(int buyAmount) {
        if (MIN_AMOUNT > buyAmount) {
            throw new IllegalArgumentException();
        }
    }
}

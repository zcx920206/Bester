package bester;

import java.util.Date;

public class Cookie implements Comparable {

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    @Override
    public boolean betterThan(Comparable other) {
        return numberOfChocolateChips > ((Cookie) other).numberOfChocolateChips;
    }
}

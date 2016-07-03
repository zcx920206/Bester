package bester;

/**
 * Created by cxzhao on 6/30/16.
 */
public class Bester {
    public Object bestAmong(Comparable[] comparables) {
        Comparable best = comparables[0];
        for (Comparable object : comparables) {
            if (object.betterThan(best)) {
                best = object;
            }
        }
        return best;
    }
}

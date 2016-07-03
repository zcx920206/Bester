package bester;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RectangleTest {
    @Test
    public void areaShouldBeEqualToLengthyMultipliedByBreadth() throws Exception {
        assertEquals(6.0, new Rectangle(2, 3).area());
        assertEquals(0.0, new Rectangle(0, 1).area());
        assertEquals(3.75, new Rectangle(1.5, 2.5).area());
    }

    @Test
    public void rectangleWithArea100IsBetterThanRectangleWithArea20() {
        assertTrue(new Rectangle(10, 10).betterThan(new Rectangle(4, 5)));
    }

    @Test
    public void rectangleWithArea25IsNotBetterThanRectangleWithArea100() {
        assertFalse(new Rectangle(5, 5).betterThan(new Rectangle(10, 10)));
    }

    @Test
    public void rectangleWithArea100IsNotBetterThanRectangleWithArea100() {
        assertFalse(new Rectangle(10, 10).betterThan(new Rectangle(10, 10)));
    }

}

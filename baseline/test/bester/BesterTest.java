package bester;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BesterTest {
    @Test
    public void cookieWith4ChocolateIsNotBetterCookiesWith4Chocolate() throws Exception {
        Bester bester = new Bester();
        Cookie cookie = new Cookie(4);
        Cookie[] cookies = new Cookie[]{cookie};
        assertEquals(cookie, bester.bestAmong(cookies));
    }

    @Test
    public void cookieWith4ChocolateIsBetterCookiesWith2Chocolate() throws Exception {
        Bester bester = new Bester();
        Cookie cookie2 = new Cookie(2);
        Cookie cookie4 = new Cookie(4);
        Cookie[] cookies = new Cookie[]{cookie2, cookie4};
        assertEquals(cookie4, bester.bestAmong(cookies));
    }

    @Test
    public void cookieWith10ChocolateIsBetterCookiesWith2And5Chocolate() throws Exception {
        Bester bester = new Bester();
        Cookie cookie2 = new Cookie(2);
        Cookie cookie4 = new Cookie(4);
        Cookie cookie10 = new Cookie(10);
        Cookie[] cookies = new Cookie[]{cookie2, cookie10,cookie4};
        assertEquals(cookie10, bester.bestAmong(cookies));
    }

    @Test
    public void rectangleWithArea100IsBestInRectangleWith100() throws Exception {
        Bester bester = new Bester();
        Rectangle reactangle = new Rectangle(10,10);
        Rectangle[] rectangles = new Rectangle[]{reactangle};
        assertEquals(reactangle, bester.bestAmong(rectangles));
    }

    @Test
    public void rectangleWithArea100IsBestInRectangleWith250() throws Exception {
        Bester bester = new Bester();
        Rectangle reactangle1 = new Rectangle(10,10);
        Rectangle rectangle2 = new Rectangle(50,50);
        Rectangle[] rectangles = new Rectangle[]{reactangle1,rectangle2};
        assertEquals(rectangle2, bester.bestAmong(rectangles));
    }

}

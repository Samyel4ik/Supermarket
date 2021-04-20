import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GiftTest {

    @Test
    void costOfSweets() {
        List<Sweetness> list = new ArrayList<>();
        list.add(new Sweetness("TT", 50, 100));
        list.add(new Sweetness("rr", 30, 50));
        Packaging packaging = new Packaging("Бумага", 100);
        Gift gift = new Gift(list, packaging);

        int actual = gift.costOfSweets();
        int expected = 150;
        assertEquals(expected, actual);
    }

    @Test
    void getTotalPrise() {
        List<Sweetness> list = new ArrayList<>();
        list.add(new Sweetness("TT", 50, 100));
        list.add(new Sweetness("rr", 30, 50));
        Packaging packaging = new Packaging("Бумага", 100);
        Gift gift = new Gift(list, packaging);

        int actual = 250;
        int expected = gift.getTotalPrise();
        assertEquals(expected, actual);

    }

    @Test
    void getTotalCalories() {
        List<Sweetness> list = new ArrayList<>();
        list.add(new Sweetness("TT", 50, 100));
        list.add(new Sweetness("rr", 30, 50));
        Packaging packaging = new Packaging("Бумага", 100);
        Gift gift = new Gift(list, packaging);

        int actual = 250;
        int expected = gift.getTotalCalories();
        assertEquals(expected, actual);
    }
}
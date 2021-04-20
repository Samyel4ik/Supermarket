import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void purchasePackaging() {
        Supermarket supermarket = new Supermarket();
        String str = "ttt";
        List<Packaging> list = new ArrayList<>();
        list.add(new Packaging("aaa", 45));
        list.add(new Packaging("ttt", 45));
        supermarket.setPackagingsMap(list);

        Packaging actual = supermarket.purchasePackaging(str);
        Packaging expected = list.remove(1);

        assertEquals(expected, actual);

    }

    @Test
    void purchaseSweetnees() {
        Supermarket supermarket = new Supermarket();
        List<Sweetness> list = new ArrayList<>();
        String str = "ttt";
        list.add(new Sweetness("aaa", 45, 45));
        list.add(new Sweetness("ttt", 50, 50));

        supermarket.setSweetnessesMap(list);

        Sweetness actual = supermarket.purchaseSweetnees(str);
        Sweetness expected = list.remove(1);

        assertEquals(expected, actual);
    }
}
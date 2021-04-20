import java.util.*;


public class Fak {
    public static void main(String[] args) {
        List<Sweetness> list = new ArrayList();

        Sweetness sweetness1 = new Sweetness("леденцы", 50, 15);
        list.add(sweetness1);
        list.add(new Sweetness("карамель", 100, 14));
        list.add(new Sweetness("печенье", 25, 10));

        Map<String, Sweetness> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).getName(), list.get(i));
        }

        System.out.println(map.keySet());

    }
}


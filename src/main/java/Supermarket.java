
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {
    Map<String, Sweetness> sweetnessesMap;
    Map<String, Packaging> packagingsMap;

    public void setSweetnessesMap(List<Sweetness> sweetnesses) {
        this.sweetnessesMap = new HashMap<>();
        for (Sweetness swetnees : sweetnesses) {
            this.sweetnessesMap.put(swetnees.getName(), swetnees);
        }

    }

    public void setPackagingsMap(List<Packaging> packagings) {
        this.packagingsMap = new HashMap<>();
        for (int i = 0; i < packagings.size(); i++) {
            this.packagingsMap.put(packagings.get(i).getName(), packagings.get(i));
        }

    }

    public Map<String, Sweetness> getSweetnesses() {
        return sweetnessesMap;
    }

    public Map<String, Packaging> getPackagings() {
        return packagingsMap;
    }

    public Packaging purchasePackaging(String str) {

        return this.packagingsMap.get(str);

    }

    public Sweetness purchaseSweetnees(String str) {
        return this.sweetnessesMap.get(str);
    }

    @Override
    public String toString() {
        return "Supermarket{" +
                "sweetnessesMap=" + sweetnessesMap +
                ", packagingsMap=" + packagingsMap +
                '}';
    }
}

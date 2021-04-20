
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
        for (Packaging packaging : packagings) {
            this.packagingsMap.put(packaging.getName(), packaging);
        }

    }

    public Set<String> getSweetnesses() {
        return this.sweetnessesMap.keySet();
    }

    public Set<String> getPackagings() {
        return this.packagingsMap.keySet();
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

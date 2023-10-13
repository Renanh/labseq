package challenge.labseq.cache;

import java.util.HashMap;

public class Cache {
    private final HashMap<Integer, Integer> data;

    public Cache() {
        this.data = new HashMap<>();
    }

    public boolean containsKey(Integer key) {
        return this.data.containsKey(key);
    }

    public Integer get(Integer key) {
        return this.data.get(key);
    }

    public void put(Integer key, Integer value) {
        this.data.put(key, value);
    }
}

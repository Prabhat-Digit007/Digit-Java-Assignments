import java.util.concurrent.ConcurrentHashMap;

public class SynchronousMap<K, V> {
    private final ConcurrentHashMap<K, V> map = new ConcurrentHashMap<>();

    public synchronized void put(K key, V value) {
        map.put(key, value);
    }

    public synchronized V get(K key) {
        return map.get(key);
    }

    public synchronized V remove(K key) {
        return map.remove(key);
    }

    public static void main(String[] args) {
        SynchronousMap<String, String> syncMap = new SynchronousMap<>();
        syncMap.put("key1", "value1");
        System.out.println("Get key1: " + syncMap.get("key1"));
        syncMap.remove("key1");
        System.out.println("Get key1 after removal: " + syncMap.get("key1"));
    }
}
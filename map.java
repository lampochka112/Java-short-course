import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        
        // Получаем значение по ключу
        System.out.println("Alice's age: " + ages.get("Alice"));
    }
}
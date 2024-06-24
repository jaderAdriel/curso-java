package generics.exercicios3;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Jader");
        cookies.put("email", "jaderadriel@gmail.com");

        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key) );
        }
    }
}

package dataStructures.list;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Jader Adriel");
        names.add("Ana Morena");
        names.add(1, "❤\uFE0F");

        for (String name : names) {
            System.out.println(name);
        }

        List<String> casal = names.stream().filter(x -> x.charAt(0) != '❤').toList();
        String homem = names.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println("homem = " + homem);
        System.out.println("casal = " + casal);
    }
}

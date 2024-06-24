package generics.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Arrays.asList(0,1,2,3,4,5));
        Set<Integer> b = new HashSet<>(Arrays.asList(5,6,7,8,9));

        // uniao de a com b
        Set<Integer> c = new HashSet<>(a);
        c.addAll(b);
        System.out.println(c);

        // interseção de a com b
        Set<Integer> d = new HashSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        // diferença
        Set<Integer> e = new HashSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}

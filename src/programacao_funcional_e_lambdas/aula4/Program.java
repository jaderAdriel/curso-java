package programacao_funcional_e_lambdas.aula4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Stream<Integer> st1 = list.stream();
        st1 = st1.map(num -> num * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "José", "Tião");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> str3 = Stream.iterate(1, n -> n * 2)
                .limit(5);

        str3.forEach(System.out::println);
    }
}

package Task1;

import java.util.*;

public class SecondHighest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 1, 4, 4, 5, 2);

        Optional<Integer> secondHighest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(secondHighest.orElse(-1));
    }
}

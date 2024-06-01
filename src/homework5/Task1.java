package homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5, 8, 1, 45, 58, 45, 5, 8, 25, 897, 4, 57, 84);
        System.out.println(list);
        int sum = list.stream().distinct()
                .filter(n -> n%2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}

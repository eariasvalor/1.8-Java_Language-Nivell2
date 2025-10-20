package n2exercici4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class N2Exercici4 {
    public static void main(String[] args){
        List<Object> things = SampleThings.getThings();

        things.stream()
                .sorted(Comparator.comparing(o -> o.toString().charAt(0)))
                .sorted((a, b) -> {
                    String stringA = a.toString();
                    String stringB = b.toString();
                    boolean aHasE = stringA.contains("e");
                    boolean bHasE = stringB.contains("e");

                    if (aHasE && !bHasE) {
                        return -1;
                    }
                    if (bHasE && !aHasE) {
                        return 1;
                    }
                    return stringA.compareTo(stringB);

                })
                .collect(Collectors.toUnmodifiableList())
                .forEach(System.out::println);

    }
}

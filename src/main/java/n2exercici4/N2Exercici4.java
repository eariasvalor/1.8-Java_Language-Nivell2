package n2exercici4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class N2Exercici4 {
    public static void main(String[] args) {
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
                .map(o -> o.toString().replace("a", "4"))
                .collect(Collectors.toList())
                .forEach(System.out::println);




        List<Object> numbers = things.stream()
                .filter(o -> o.toString().matches("\\d+"))
                .collect(Collectors.toList());

        System.out.println();
        System.out.println("List with only numbers:");
        numbers.forEach(System.out::println);





    }
}

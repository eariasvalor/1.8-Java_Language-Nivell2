package n2exercici2;

import java.util.List;
import java.util.stream.Collectors;

public class N2Exercici2 {
    public static void main(String[] args) {
        List<Integer> numbers = SampleNumbers.getNumbers();
        String result = numbers.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(", "));

        System.out.println(result);

    }
}

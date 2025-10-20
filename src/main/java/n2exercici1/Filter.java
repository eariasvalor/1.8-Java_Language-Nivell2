package n2exercici1;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public List<String> filterByFirstLetterAndLength(List<String> list, String letter, int numChars) {
        if (list == null) {
            throw new IllegalArgumentException("The list or the letter cannot be empty.");
        }
        String upperLetter = letter.toUpperCase();
        return list.stream()
                .filter(s -> s.length() == numChars)
                .filter(s -> s.startsWith(upperLetter))
                .collect(Collectors.toUnmodifiableList());

    }
}

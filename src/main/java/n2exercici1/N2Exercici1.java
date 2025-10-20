package n2exercici1;

import java.util.List;

public class N2Exercici1 {
    public static void main(String[] args) {
        List<String> names = SampleNames.getNames();
        Filter filter = new Filter();

        List<String> filteredList = filter.filterByFirstLetterAndLength(names, "A", 3);

        filteredList.forEach(System.out::println);

    }
}


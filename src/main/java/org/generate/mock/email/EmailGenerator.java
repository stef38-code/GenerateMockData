package org.generate.mock.email;

import org.generate.mock.person.GeneratorUserName;

import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @see https://medium.com/javarevisited/how-to-generate-mock-data-in-java-ff3b5f66f167
 */
public class EmailGenerator {
    private static final List<String> domain = List.of("@gmail.com", "@yahoo.com", "@outlook.com");

    /**
     * Orginal article
     */
     public static List<String> streamMailId(long size) {


        Supplier<String> supplier = () ->{
            String userName = GeneratorUserName.generateUserName();
            Random random = new Random();
            int index = random.nextInt(domain.size());
            return userName+domain.get(index);
        };

        return Stream.generate(supplier).limit(size).collect(Collectors.toList());
    }
    public static List<String> mailMale(long size) {
        Supplier<String> supplier = () ->{
            String userName = GeneratorUserName.generateMaleUserName()
                    .replace(" ",".")
                    .toLowerCase(Locale.getDefault());
            Random random = new Random();
            int index = random.nextInt(domain.size());
            return userName+domain.get(index);
        };
        return Stream.generate(supplier).limit(size).collect(Collectors.toList());
    }
}

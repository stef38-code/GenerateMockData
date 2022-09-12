package org.generate.mock.email;

import org.generate.mock.person.GeneratorUserName;

import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @see https://medium.com/javarevisited/how-to-generate-mock-data-in-java-ff3b5f66f167
 */
public class EmailGenerator {
    private final long size;
    public EmailGenerator() {
        this(1);
    }
    public EmailGenerator(long size){
        this.size = size;
    }

    public static List<String> mailFemale(int size) {
        String userName = GeneratorUserName.generateFemaleUserName()
                .replace(" ", ".")
                .toLowerCase(Locale.getDefault());
        Supplier<String> supplier = getSupplier(userName);
        return Stream.generate(supplier).limit(size).collect(Collectors.toList());
    }


    /**
     * Orginal article
     */
     public static List<String> streamMailId(long size) {
        Supplier<String> supplier = () ->{
            String userName = GeneratorUserName.generateUserName();
            return randValue(userName, DictionaryDomain.domains());
        };

        return Stream.generate(supplier).limit(size).collect(Collectors.toList());
    }
    public static List<String> mailMale(long size) {
                String userName = GeneratorUserName.generateMaleUserName()
                        .replace(" ", ".")
                        .toLowerCase(Locale.getDefault());
                Supplier<String> supplier = getSupplier(userName);
                return Stream.generate(supplier).limit(size).collect(Collectors.toList());
    }

    private static Supplier<String> getSupplier(String userName) {
        return () ->{
            List<String> domains = DictionaryDomain.domains();
            return randValue(userName,domains);
        };
    }

    private static String randValue(String userName,List<String> domains){
        SecureRandom random = new SecureRandom();
        int index = random.nextInt(domains.size());
        return userName+domains.get(index);
    }
}

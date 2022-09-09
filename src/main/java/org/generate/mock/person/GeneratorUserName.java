package org.generate.mock.person;

import java.security.SecureRandom;
import java.util.List;

public class GeneratorUserName {

    private GeneratorUserName() {
        throw new UnsupportedOperationException("GeneratorUserName is a utility class and cannot be instantiated");
    }

    public static String generateUserName() {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom random = new SecureRandom();
        StringBuilder userName = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            userName.append(chars.charAt(random.nextInt(chars.length())));
        }
        return userName.toString();
    }

    public static String generateMaleUserName() {
        return generateLastName() + " " + generateBoyName();
    }

    public static String generateFemaleUserName() {
        return generateLastName() + " " + generateGirlName();
    }

    public static String generateBoyName() {
        SecureRandom random = new SecureRandom();
        List<String> boyName = DictionaryPerson.boyName();
        return boyName.get(random.nextInt(boyName.size()));
    }

    public static String generateGirlName() {
        SecureRandom random = new SecureRandom();
        List<String> girlName = DictionaryPerson.girlName();
        return girlName.get(random.nextInt(girlName.size()));
    }

    public static String generateLastName() {
        SecureRandom random = new SecureRandom();
        List<String> lastName = DictionaryPerson.lastName();
        return lastName.get(random.nextInt(lastName.size()));
    }

}

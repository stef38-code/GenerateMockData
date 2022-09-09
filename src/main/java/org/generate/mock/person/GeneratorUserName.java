package org.generate.mock.person;

import java.util.List;
import java.util.Random;

public class GeneratorUserName {
    private GeneratorUserName() {
        throw new UnsupportedOperationException("GeneratorUserName is a utility class and cannot be instantiated");
    }
    public static String generateUserName() {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder userName = new StringBuilder();
        for(int i=0;i<10;i++){
            userName.append(chars.charAt(random.nextInt(chars.length())));
        }
        return userName.toString();
    }
    public static String generateMaleUserName(){
        return generateLastName()+" " + generateBoyName();
    }
    public static String generateFemaleUserName(){
        return generateLastName()+" " + generateGirlName();
    }
    public static String generateBoyName(){
        Random random = new Random();
        List<String> boyName = DictionaryPerson.boyName();
        return boyName.get(random.nextInt(boyName.size()));
    }
    public static String generateGirlName(){
        Random random = new Random();
        List<String> girlName = DictionaryPerson.girlName();
        return girlName.get(random.nextInt(girlName.size()));
    }
    public static String generateLastName(){
        Random random = new Random();
        List<String> lastName = DictionaryPerson.lastName();
        return lastName.get(random.nextInt(lastName.size()));
    }

}

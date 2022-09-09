package org.generate.mock.person;

import org.assertj.core.api.Assertions;
import org.generate.mock.person.GeneratorUserName;
import org.junit.jupiter.api.Test;

class GeneratorUserNameTest {

    @Test
    void generateUserName() {
        String userName = GeneratorUserName.generateUserName();
        System.out.println(userName);
        Assertions.assertThat(userName).isNotBlank();
    }

    @Test
    void generateMaleUserName() {
        String userName = GeneratorUserName.generateMaleUserName();
        System.out.println(userName);
        Assertions.assertThat(userName).isNotBlank();
    }
    @Test
    void generateFemaleUserName() {
        String userName = GeneratorUserName.generateFemaleUserName();
        System.out.println(userName);
        Assertions.assertThat(userName).isNotBlank();
    }

    @Test
    void generateBoyName() {
        String userName = GeneratorUserName.generateBoyName();
        System.out.println(userName);
        Assertions.assertThat(userName).isNotBlank();
    }

    @Test
    void generateGirlName() {
        String userName = GeneratorUserName.generateGirlName();
        System.out.println(userName);
        Assertions.assertThat(userName).isNotBlank();
    }

    @Test
    void generateLastName() {
        String userName = GeneratorUserName.generateGirlName();
        System.out.println(userName);
        Assertions.assertThat(userName).isNotBlank();
    }
}

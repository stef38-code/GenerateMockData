package org.generate.mock.email;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class EmailTest {
    @Test
    void create_Man(){
        List<String> emailMan = Email.builder().man().create();
        Assertions.assertThat(emailMan).isNotNull().hasSize(1);
    }
    @Test
    void create_TenMen(){
        List<String> emailTenMen = Email.builder().men(10).create();
        Assertions.assertThat(emailTenMen).isNotNull().hasSize(10);
    }
    @Test
    void create_Woman(){
        List<String> emailWoman = Email.builder().woman().create();
        Assertions.assertThat(emailWoman).isNotNull().hasSize(1);
    }
    @Test
    void create_TenWomen(){
        List<String> emailWomen = Email.builder().women(10).create();
        Assertions.assertThat(emailWomen).isNotNull().hasSize(10);
    }
    @Test
    void create_OneMixte(){
        List<String> emailMixte = Email.builder().man().woman().create();
        Assertions.assertThat(emailMixte).isNotNull().hasSize(2);
    }
    @Test
    void create_TenMixte(){
        List<String> emailMixte = Email.builder().men(5).women(9).create();
        Assertions.assertThat(emailMixte).isNotNull().hasSize(14);
    }
}

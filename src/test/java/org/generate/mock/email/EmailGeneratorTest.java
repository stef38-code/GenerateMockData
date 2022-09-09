package org.generate.mock.email;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class EmailGeneratorTest {
    @Test
    void show() {
        List<String> streamMailId = EmailGenerator.streamMailId(10);
        Assertions.assertThat(streamMailId).isNotEmpty().hasSize(10);
    }

    @Test
    void mailMale() {
        List<String> streamMailId = EmailGenerator.mailMale(50);
        System.out.println(streamMailId);
        Assertions.assertThat(streamMailId).isNotEmpty().hasSize(50);
    }
}

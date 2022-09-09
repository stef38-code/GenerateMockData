package org.generate.mock.uuid;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

class UuidGeneratorTest {

    @Test
     void getList() {
        List<UUID> uuids = UuidGenerator.getList(10);
        Assertions.assertThat(uuids).isNotEmpty().hasSize(10);
    }
    @Test
    void getStringList() {
        List<String> uuids = UuidGenerator.getStringList(10);
        Assertions.assertThat(uuids).isNotEmpty().hasSize(10);
    }
    @Test
    void getStringList_replaceDashLess() {
        List<String> uuids = UuidGenerator.getStringList(10,"@");
        Assertions.assertThat(uuids).isNotEmpty()
                .hasSize(10)
                .doesNotContain("-")
                .anyMatch(item -> item.contains("@"));
    }
}

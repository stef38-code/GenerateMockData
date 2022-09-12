package org.generate.mock.email;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Email extends ArrayList<String> {

    private Email(Builder builder) {
        if (CollectionUtils.isNotEmpty(builder.mailMale)) {
            addAll(builder.mailMale);
        }
        if (CollectionUtils.isNotEmpty(builder.mailFemale)) {
            addAll(builder.mailFemale);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private List<String> mailMale;
        private List<String> mailFemale;

        private Builder() {
        }

        public Builder men(int capacity) {
            mailMale = EmailGenerator.mailMale(capacity);
            return this;
        }

        public Builder man() {
            mailMale = EmailGenerator.mailMale(1);
            return this;
        }

        public Email create() {
            return new Email(this);
        }

        public Builder woman() {
            mailFemale = EmailGenerator.mailFemale(1);
            return this;
        }

        public Builder women(int capacity) {
            mailFemale = EmailGenerator.mailFemale(capacity);
            return this;
        }
    }
}

package foo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Objects;

import java.util.UUID;

public class Foo {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private final UUID fooId;

    @JsonCreator
    public Foo(@JsonProperty(value = "fooid", required = true) UUID fooId) {
        this.fooId = fooId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foo that = (Foo) o;
        return Objects.equal(fooId, that.fooId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fooId);
    }

}


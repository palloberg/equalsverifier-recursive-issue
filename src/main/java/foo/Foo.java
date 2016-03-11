package foo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.util.UUID;

/**
 * Test
 */
public class Foo extends AbstractFoo implements BarInterface {

    private final UUID fooId;

    @JsonCreator
    public Foo(@JsonProperty(value = "fooid", required = true) UUID fooId) {
        this.fooId = fooId;
    }

    public String getBaz() {
        return "Foo!";
    }

    public UUID getFooId() {
        return fooId;
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

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("fooId", fooId)
                .toString();
    }
}


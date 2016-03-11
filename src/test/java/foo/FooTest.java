package foo;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class FooTest {

    @Test
    public void equals_and_hashcode_contracts() {
        EqualsVerifier.forClass(Foo.class)
                .verify();
    }

}

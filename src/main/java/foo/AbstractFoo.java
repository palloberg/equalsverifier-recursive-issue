package foo;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class AbstractFoo {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private String quux = null;

    public abstract String getBaz();

    public final String getQuux() {
        return quux;
    }

    public final <T extends AbstractFoo> T setQuux(String quux) {
        this.quux = quux;
        return (T) this;
    }
}

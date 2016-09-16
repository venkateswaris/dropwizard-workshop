import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class DevConfiguration extends Configuration {

    @JsonProperty
    private String env;

    public String getEnv() {
        return env;
    }

}
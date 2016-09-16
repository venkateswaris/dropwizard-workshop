import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class AppConfiguration extends Configuration {

    @JsonProperty
    private String env;

}
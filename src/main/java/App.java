import com.fasterxml.jackson.databind.MapperFeature;
import controller.ApplicationHealthCheck;
import controller.BeachResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;


public class App extends Application<AppConfiguration> {


    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    public void run(AppConfiguration configuration, Environment environment) throws Exception {
        final ApplicationHealthCheck healthCheck = new ApplicationHealthCheck();
        final BeachResource beachResource = new BeachResource();
        environment.healthChecks().register("application", healthCheck);
        environment.jersey().register(beachResource);

        environment.getObjectMapper().disable(MapperFeature.DEFAULT_VIEW_INCLUSION);
    }
}

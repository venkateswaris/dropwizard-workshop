import controller.ApplicationHealthCheck;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;


public class App extends Application<AppConfiguration> {


    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    public void run(AppConfiguration configuration, Environment environment) throws Exception {
        final ApplicationHealthCheck healthCheck =
                new ApplicationHealthCheck();
        environment.healthChecks().register("application", healthCheck);
        environment.jersey().register(healthCheck);
    }
}

package app.backendrentcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestBackendRentcarApplication {

    public static void main(String[] args) {
        SpringApplication.from(BackendRentcarApplication::main).with(TestBackendRentcarApplication.class).run(args);
    }

}

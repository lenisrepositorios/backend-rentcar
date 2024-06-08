package app.backendrentcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "app.backendrentcar")
public class BackendRentcarApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendRentcarApplication.class, args);
    }

}

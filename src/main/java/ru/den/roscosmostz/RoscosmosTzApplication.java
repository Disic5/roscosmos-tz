package ru.den.roscosmostz;



import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "ROSCOSMOS", version = "v1"))

public class RoscosmosTzApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoscosmosTzApplication.class, args);
    }

}

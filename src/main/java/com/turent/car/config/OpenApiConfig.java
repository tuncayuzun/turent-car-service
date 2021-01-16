package com.turent.car.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Car Service Api")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Tuncay Uzun")
                                .email("tuncay@tuncayuzun.net")
                        )
                        .license(new License()
                                .name("Turent 1.0")
                                .url("http://tuncayuzun.net")
                        )

                );
    }
}

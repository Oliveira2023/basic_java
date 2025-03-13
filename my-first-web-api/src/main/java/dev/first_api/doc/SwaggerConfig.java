package dev.first_api.doc;

import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

import java.util.List;

@Configuration

public class SwaggerConfig {
    private Contact contact = new Contact()
            .name("First API")
            .email("localhost:8080")
            .url("email@site.com.br");

    @Bean
    public OpenAPI springOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("First API")
                        .description("API para estudo de Spring Boot")
                        .version("1.0")
                        .termsOfService("Termo de uso: Deve ser usada para estudo")
                        .license(new License()
                                .name("Licença - Open Source")
                                .url("https://www.linkedin.com/in/rodrigo-ferreira-oliveira-6b906b1b1/"))
                        .contact(this.contact))
                        .servers(List.of(
                                new Server()
                                        .url("http://localhost:8080")
                                        .description("Localhost")
                        ));

    }

}

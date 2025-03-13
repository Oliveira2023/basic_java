package dev.oliveira.singleton_prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Bean
    @Scope("prototype")
    public Remetente remetente() {
        System.out.println("Criando um objeto Remetente");
        Remetente remetente = new Remetente();
        remetente.setNome("Digital Innovation One");
        remetente.setEmail("noreplay@dio.com.br");
        return remetente;
    }
}

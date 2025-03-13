package dev.oliveira.properties_value.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Value("${nome:Desconhecido}")//Se não encontrar a propriedade, o valor padrão é Desconhecido
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones ;
//            new ArrayList<>(Arrays.asList(new Long[]{123456789L, 987654321L}));

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome
                + "\nEmail: " + email
                + "\nTelefone: " + telefones.get(0));
        System.out.println("Seu cadastro foi aprovado!");
    }
}

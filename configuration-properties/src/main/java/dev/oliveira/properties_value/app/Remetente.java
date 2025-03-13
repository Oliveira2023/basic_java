package dev.oliveira.properties_value.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "remetente")
public class Remetente {
    private String nome;
    private String email;
    private Long[] telefones;

    public Remetente() {
    }

    public Remetente(String nome, String email, Long[] telefones) {
        this.nome = nome;
        this.email = email;
        this.telefones = telefones;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Long[] getTelefones() {
        return telefones;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefones(Long[] telefones) {
        this.telefones = telefones;
    }
}

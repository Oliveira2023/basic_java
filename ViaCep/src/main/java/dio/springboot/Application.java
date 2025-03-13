package dio.springboot;

import dio.springboot.viaCep.ConversorJson;
import dio.springboot.viaCep.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.springboot.viaCep.ConversorJson;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\":\"01001-000\",\"logradouro\":\"Praça da Sé\",\"complemento\":\"lado ímpar\",\"bairro\":\"Sé\",\"localidade\":\"São Paulo\",\"uf\":\"SP\",\"unidade\":\"\",\"ibge\":\"3550308\",\"gia\":\"1004\"}";
			ViaCepResponse response = conversor.convert(json);
			System.out.println("Dados do CEP: " + response);
		};
	}

}

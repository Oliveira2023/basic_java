package dev.oliveira.singleton_prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagens {

    @Autowired
    private Remetente noreply;

    @Autowired
    private Remetente techteam;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Enviando mensagem de confirmação de cadastro!");
    }

    public void enviarMensagemBoasVindas() {
        techteam.setEmail("tech@dio.com.br");
        System.out.println(techteam);
        System.out.println("Bem vindo a Tech Elite!");
    }



}

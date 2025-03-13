package dev.spring_data_jpa;

import dev.spring_data_jpa.model.User;
import dev.spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello, Spring Data JPA!");

//        List<User> users = userRepository.findAll();
        List<User> users = userRepository.findByNameContaining("Luciano");
        if(users.isEmpty()) {
            insertUser();
        } else {
            for(User u : users) {
                System.out.println(u.getName());
            }
        }
    }
    private void insertUser() {
        User usuario = new User();
        usuario.setName("Luciano");
        usuario.setUsername("oliveira");
        usuario.setPassword("1234");

        userRepository.save(usuario);

        for(User u : userRepository.findAll()) {
            System.out.println(u.getName());
        }
    }

}

package dev.first_api.controller;

import dev.first_api.Model.Usuario;
import dev.first_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UserRepository repository;

    @GetMapping("")
    public List<Usuario> getUsers() {
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping("")
    public void save(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
    @PutMapping
    public void update(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

}

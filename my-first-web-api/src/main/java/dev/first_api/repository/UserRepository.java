package dev.first_api.repository;

import dev.first_api.Model.Usuario;
import dev.first_api.handler.BusinessException;
import dev.first_api.handler.CampoObrigatorioException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario usuario) {
        if (usuario.getLogin()==null){
//            throw new BusinessException("O campo login é obrigatório");
            throw new CampoObrigatorioException("login");
        }
        if (usuario.getPassword()==null){
            throw new CampoObrigatorioException("password");
        }
        if (usuario.getId() == null) {
            System.out.println("SAVE -  Recebendo o usuário na camada de repositórios");
            System.out.println(usuario);
        }else {
            System.out.println("UPDATE -  Recebendo o usuário na camada de repositórios");
            System.out.println(usuario);
        }
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id -  Recebendo o id: %d para apagar", id));
        System.out.println(id);
    }
    public List<Usuario> findAll() {
        System.out.println("FINDALL -  Buscando todos os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("admin", "admin"));
        usuarios.add(new Usuario("user", "user"));
        return usuarios;
    }
    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id -  Buscando o usuário com id: %d", id));
        return new Usuario("admin", "admin");
    }
    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username -  Buscando o usuário com username: %s", username));
        return new Usuario("admin", "admin");
    }
}

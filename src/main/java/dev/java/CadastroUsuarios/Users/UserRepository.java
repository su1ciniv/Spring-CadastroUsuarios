package dev.java.CadastroUsuarios.Users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    Long id(Long id);
}
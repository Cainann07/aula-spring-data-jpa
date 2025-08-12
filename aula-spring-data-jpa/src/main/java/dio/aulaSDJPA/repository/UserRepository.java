package dio.aulaSDJPA.repository;

import dio.aulaSDJPA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    // Essa interface disponibiliza métodos já pré-definidos para uso sem precisar criar um aimplementação, junto disso, é criado a entidade e sua chave primária.
}

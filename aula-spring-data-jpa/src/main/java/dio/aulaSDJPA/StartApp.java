package dio.aulaSDJPA;

import dio.aulaSDJPA.model.User;
import dio.aulaSDJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired // Injeção de dependência
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Mateus");
        user.setUsername("Mateuss_07");
        user.setPassword("dio123");

        repository.save(user); // Insere ou modifica um registro no BD

        for(User u: repository.findAll()){ // Exibe todos os registros
            System.out.println(u);
        }
    }
}

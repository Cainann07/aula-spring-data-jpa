package dio.aulaSDJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Habilita a autoconfiguração e escaneamento de componentes
public class AulaSpringDataJpaApplication { // Não se pode implementar intruções de código nessa classe, sua unica tarefa é inicializar o programa

	public static void main(String[] args) {
		SpringApplication.run(AulaSpringDataJpaApplication.class, args);
	}

}

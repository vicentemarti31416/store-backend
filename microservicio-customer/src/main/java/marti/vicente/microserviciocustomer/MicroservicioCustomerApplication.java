package marti.vicente.microserviciocustomer;

import marti.vicente.microserviciocustomer.entity.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class MicroservicioCustomerApplication implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		config.exposeIdsFor(Customer.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioCustomerApplication.class, args);
	}

}

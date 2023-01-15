package marti.vicente.microservicioinvoice;

import marti.vicente.microservicioinvoice.entity.Invoice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class MicroservicioInvoiceApplication implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		config.exposeIdsFor(Invoice.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioInvoiceApplication.class, args);
	}

}

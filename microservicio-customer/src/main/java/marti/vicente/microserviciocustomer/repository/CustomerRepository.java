package marti.vicente.microserviciocustomer.repository;
import marti.vicente.microserviciocustomer.entity.Customer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByName(String name);

    List<Customer> findByPhone(@Param("phone") Integer phone, Pageable pageable);

}

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {
    
}
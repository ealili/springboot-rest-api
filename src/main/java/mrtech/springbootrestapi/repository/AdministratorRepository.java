package mrtech.springbootrestapi.repository;

import mrtech.springbootrestapi.pojo.Administrator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdministratorRepository extends CrudRepository<Administrator, String> {
    Optional<Administrator> findAdministratorByUsernameAndPassword(String username, String password);

    Administrator findAdministratorByUsername(String username);

    Administrator save(Administrator administrator);
}

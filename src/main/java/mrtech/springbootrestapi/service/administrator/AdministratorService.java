package mrtech.springbootrestapi.service.administrator;

import mrtech.springbootrestapi.pojo.Administrator;

import java.util.Optional;

public interface AdministratorService {
    Optional<Administrator> findAdministratorByUsernameAndPassword(Administrator administrator);

    Administrator save(Administrator administrator);
}

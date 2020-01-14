package mrtech.springbootrestapi.service.administrator;

import mrtech.springbootrestapi.pojo.Administrator;
import mrtech.springbootrestapi.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DefaultAdministratorService implements AdministratorService {

    @Autowired
    private AdministratorRepository administratorRepository;

    @Override
    public Optional<Administrator> findAdministratorByUsernameAndPassword(Administrator administrator) {
        return administratorRepository.findAdministratorByUsernameAndPassword(administrator.getUsername(), administrator.getPassword());
    }

    @Override
    public Administrator save(Administrator administrator) {
        if (administratorRepository.findAdministratorByUsername(administrator.getUsername()) != null) {
            return null;
        }
        return administratorRepository.save(administrator);
    }

    @Override
    public boolean delete(String username) {
        Administrator administrator = administratorRepository.findAdministratorByUsername(username);
        if (administrator != null) {
            administratorRepository.delete(administrator);
            return true;
        }
        return false;
    }

    @Override
    public Administrator update(String username, Administrator administrator) {
        Administrator administratorToUpdate =
                administratorRepository.findAdministratorByUsername(username);

        if (administratorToUpdate == null) {
            return null;
        }

        administratorRepository.delete(administratorToUpdate);
        return administratorRepository.save(administrator);

    }
}
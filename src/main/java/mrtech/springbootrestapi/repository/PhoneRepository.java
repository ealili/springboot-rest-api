package mrtech.springbootrestapi.repository;

import mrtech.springbootrestapi.pojo.Phone;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhoneRepository extends CrudRepository<Phone, String> {

    List<Phone> findAll();

    Phone findPhoneById(String id);

    List<Phone> findAllByManufacturer_Mname(String mname);

    Phone save(Phone phone);

    void delete(Phone phone);
}

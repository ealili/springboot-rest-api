package mrtech.springbootrestapi.repository;

import mrtech.springbootrestapi.pojo.Administrator;
import mrtech.springbootrestapi.pojo.Phone;
import mrtech.springbootrestapi.pojo.PhoneInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PhoneRepository extends CrudRepository<Phone, String> {

    List<Phone> findAll();

    Phone findPhoneById(String id);

    List<Phone> findAllByManufacturer_Mname(String mname);

    Phone save(Phone phone);

    void delete(Phone phone);
}

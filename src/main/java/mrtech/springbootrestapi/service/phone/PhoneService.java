package mrtech.springbootrestapi.service.phone;

import mrtech.springbootrestapi.pojo.Manufacturer;
import mrtech.springbootrestapi.pojo.Phone;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PhoneService {
    List<Phone> findAll();

    List<Phone> findAllByManufacturer_Mname(String mname);

    Phone findPhoneById(String id);
}


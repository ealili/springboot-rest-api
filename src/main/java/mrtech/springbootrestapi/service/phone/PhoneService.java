package mrtech.springbootrestapi.service.phone;

import mrtech.springbootrestapi.pojo.Phone;
import mrtech.springbootrestapi.pojo.PhoneInput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PhoneService {
    List<Phone> findAll();

    List<Phone> findAllByManufacturer_Mname(String mname);

    Phone findPhoneById(String id);

    Phone save(PhoneInput phoneInput);
}


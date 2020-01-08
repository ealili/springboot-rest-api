package mrtech.springbootrestapi.service;

import mrtech.springbootrestapi.pojo.Phone;
import mrtech.springbootrestapi.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultPhoneService implements PhoneService {

    @Autowired
    private PhoneRepository phoneRepository;

    @Override
    public List<Phone> findAllByManufacturer_Mname(String mname) {
        return phoneRepository.findAllByManufacturer_Mname(mname);
    }

    @Override
    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }

    @Override
    public Phone findPhoneById(String id) {
        return phoneRepository.findPhoneById(id);
    }
}

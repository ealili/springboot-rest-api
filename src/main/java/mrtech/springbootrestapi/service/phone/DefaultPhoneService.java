package mrtech.springbootrestapi.service.phone;

import mrtech.springbootrestapi.pojo.Manufacturer;
import mrtech.springbootrestapi.pojo.Phone;
import mrtech.springbootrestapi.pojo.PhoneInput;
import mrtech.springbootrestapi.repository.ManufacturerRepository;
import mrtech.springbootrestapi.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultPhoneService implements PhoneService {

    @Autowired
    private PhoneRepository phoneRepository;

    @Autowired
    private ManufacturerRepository manufacturerRepository;

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

    @Override
    public Phone save(PhoneInput phoneInput) {
        //Check if this manufacturer already exists!
        Manufacturer manufacturer = manufacturerRepository.findManufacturerByMname(phoneInput.getMname());
        if (manufacturer == null) {
            return null;
        }

        if (phoneRepository.findPhoneById(formatId(phoneInput.getName())) != null) {
            return null;
        }

        Phone phone = new Phone();
        phone.setId(formatId(phoneInput.getName()));
        phone.setName(phoneInput.getName());
        phone.setManufacturer(manufacturer);
        phone.setSelfieCamera(phoneInput.getSelfieCamera());
        phone.setBattery(phoneInput.getBattery());
        phone.setDisplayResolution(phoneInput.getDisplayResolution());
        phone.setDisplaySize(phoneInput.getDisplaySize());
        phone.setDisplayType(phoneInput.getDisplayType());
        phone.setImgSource(phoneInput.getImgSource());
        phone.setMainCamera(phoneInput.getMainCamera());
        phone.setName(phoneInput.getName());
        phone.setWeight(phoneInput.getWeight());
        phone.setProductionYear(phoneInput.getProductionYear());
        phone.setSound(phoneInput.getSound());
        phone.setTechnology(phoneInput.getTechnology());
        phone.setOs(phoneInput.getOs());

        return phoneRepository.save(phone);
    }

    public String formatId(String id) {
        id = Character.toLowerCase(id.charAt(0)) + id.substring(1);
        id = id.replaceAll("\\s+", "");
        return id;
    }

    @Override
    public Phone update(String id, PhoneInput phoneInput) {
        Phone phoneToUpdate =
                phoneRepository.findPhoneById(id);

        if (phoneToUpdate == null) {
            return null;
        }

        phoneRepository.delete(phoneToUpdate);
        return this.save(phoneInput);

    }

    @Override
    public boolean delete(String id) {
        Phone phone = phoneRepository.findPhoneById(id);
        if (phone != null) {
            phoneRepository.delete(phone);
            return true;
        }
        return false;
    }
}

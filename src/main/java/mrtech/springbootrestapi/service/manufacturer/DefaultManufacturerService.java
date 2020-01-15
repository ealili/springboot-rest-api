package mrtech.springbootrestapi.service.manufacturer;

import mrtech.springbootrestapi.pojo.Administrator;
import mrtech.springbootrestapi.pojo.Manufacturer;
import mrtech.springbootrestapi.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultManufacturerService implements ManufacturerService {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    @Override
    public List<Manufacturer> findAll() {
        return manufacturerRepository.findAll();
    }

    @Override
    public Manufacturer save(Manufacturer manufacturer) {
        //Check if this manufacturer already exists!
        if (manufacturerRepository.findManufacturerByMname(manufacturer.getMname()) != null) {
            return null;
        }

        return manufacturerRepository.save(manufacturer);
    }

    @Override
    public Manufacturer update(String mname, Manufacturer manufacturer) {
        Manufacturer manufacturerToUpate =
                manufacturerRepository.findManufacturerByMname(mname);

        if (manufacturerToUpate == null) {
            return null;
        }

        manufacturerRepository.delete(manufacturerToUpate);
        return manufacturerRepository.save(manufacturer);
    }

    @Override
    public boolean delete(String mname) {
        Manufacturer manufacturer =
                manufacturerRepository.findManufacturerByMname(mname);
        if (manufacturer != null) {
            manufacturerRepository.delete(manufacturer);
            return true;
        }
        return false;
    }
}

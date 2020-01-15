package mrtech.springbootrestapi.service.manufacturer;

import mrtech.springbootrestapi.pojo.Manufacturer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ManufacturerService {
    List<Manufacturer> findAll();

    Manufacturer save(Manufacturer manufacturer);

    boolean delete(String mname);
}

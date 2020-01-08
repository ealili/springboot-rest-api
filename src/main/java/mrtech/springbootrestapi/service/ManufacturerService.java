package mrtech.springbootrestapi.service;

import mrtech.springbootrestapi.pojo.Manufacturer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ManufacturerService {
    List<Manufacturer> findAll();
}

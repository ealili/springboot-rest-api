package mrtech.springbootrestapi.service;

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
}

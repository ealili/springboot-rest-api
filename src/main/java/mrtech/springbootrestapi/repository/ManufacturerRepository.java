package mrtech.springbootrestapi.repository;

import mrtech.springbootrestapi.pojo.Manufacturer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManufacturerRepository extends CrudRepository<Manufacturer, String> {

    List<Manufacturer> findAll();

    Manufacturer findManufacturerByMname(String mname);
}

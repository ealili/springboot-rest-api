package mrtech.springbootrestapi.controller;

import mrtech.springbootrestapi.pojo.Manufacturer;
import mrtech.springbootrestapi.service.manufacturer.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ManufacturerController {

    @Autowired
    private ManufacturerService manufacturerService;

    @GetMapping("/manufacturers")
    public List<Manufacturer> getAllManufacturers() {
        return manufacturerService.findAll();
    }

    @PostMapping(path = "/manufacturer/save", consumes = "application/json",
            produces = "application/json")
    public Manufacturer saveManufacturer(@RequestBody Manufacturer manufacturer) {
        return manufacturerService.save(manufacturer);
    }

}

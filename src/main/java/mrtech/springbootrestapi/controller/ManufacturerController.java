package mrtech.springbootrestapi.controller;

import mrtech.springbootrestapi.pojo.Manufacturer;
import mrtech.springbootrestapi.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

package mrtech.springbootrestapi.controller;

import mrtech.springbootrestapi.pojo.Phone;
import mrtech.springbootrestapi.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    public PhoneController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @GetMapping("/phones")
    public List<Phone> getAllPhones() {
        return phoneService.findAll();
    }

    @GetMapping("/phones/{mname}")
    public List<Phone> getPhonesByMname(@PathVariable String mname) {
        return phoneService.findAllByManufacturer_Mname(mname);
    }

    @GetMapping("/phone/{id}")
    public Phone getPhoneById(@PathVariable String id) {
        return phoneService.findPhoneById(id);
    }
}

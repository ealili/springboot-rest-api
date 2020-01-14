package mrtech.springbootrestapi.controller;

import mrtech.springbootrestapi.pojo.Phone;
import mrtech.springbootrestapi.pojo.PhoneInput;
import mrtech.springbootrestapi.service.phone.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping(path = "/phone/save", consumes = "application/json", produces = "application/json")
    public Phone savePhone(@RequestBody PhoneInput phoneInput) {
        return phoneService.save(phoneInput);
    }
}

package mrtech.springbootrestapi.controller;

import mrtech.springbootrestapi.pojo.Administrator;
import mrtech.springbootrestapi.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @PostMapping(path = "/administrator", consumes = "application/json", produces = "application/json")
    public Optional<Administrator> getAdministrator(@RequestBody Administrator administrator) {
        return administratorService.findAdministratorByUsernameAndPassword(administrator);
    }

    @PostMapping(path = "/administrator/save", consumes = "application/json", produces = "application/json")
    public Administrator saveAdministrator(@RequestBody Administrator administrator) {
        return administratorService.save(administrator);
    }
}

package mrtech.springbootrestapi.controller;

import mrtech.springbootrestapi.pojo.Administrator;
import mrtech.springbootrestapi.service.administrator.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api", method = RequestMethod.PUT)
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

    @PutMapping("/administrator/update/{username}")
    public Administrator updateAdministrator(@PathVariable String username,
                                             @RequestBody Administrator administrator) {
        return administratorService.update(username, administrator);
    }

    @DeleteMapping("/administrator/delete/{username}")
    public ResponseEntity<Void> deleteAdministrator(@PathVariable String username) {
        if (administratorService.delete(username)) {
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }

}

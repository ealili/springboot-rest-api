package mrtech.springbootrestapi;

import mrtech.springbootrestapi.pojo.Administrator;
import mrtech.springbootrestapi.pojo.Manufacturer;
import mrtech.springbootrestapi.pojo.Phone;
import mrtech.springbootrestapi.pojo.PhoneInput;
import mrtech.springbootrestapi.service.administrator.AdministratorService;
import mrtech.springbootrestapi.service.phone.PhoneService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class DefaultAdministratorServiceTests {
    @Autowired
    private AdministratorService administratorService;

    @Test
    public void testSaveAdministratorService() {
        Administrator administrator = new Administrator("testName","testUsername","testPassword");
        assertNull(administratorService.save(administrator));
    }

}

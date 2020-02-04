package mrtech.springbootrestapi;

import mrtech.springbootrestapi.service.phone.PhoneService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;



@SpringBootTest
public class DefaultPhoneServiceTests {
    @Autowired
    private PhoneService phoneService;

    @Test
    public void testfindAllByManufacturer_MnameService() {
        String mname = "Apple";
        assertNotNull(phoneService.findAllByManufacturer_Mname(mname));
    }

    @Test
    public void testFindAllService() {
        assertNotNull(phoneService.findAll());
    }
}

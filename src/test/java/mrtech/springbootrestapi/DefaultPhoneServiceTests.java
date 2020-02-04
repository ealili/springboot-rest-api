package mrtech.springbootrestapi;

import mrtech.springbootrestapi.pojo.Manufacturer;
import mrtech.springbootrestapi.pojo.Phone;
import mrtech.springbootrestapi.pojo.PhoneInput;
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

    @Test
    public void testFindPhoneByIdService() {
        String id = "googlePixel4XL";
        assertNotNull(phoneService.findPhoneById(id));
    }

    @Test
    public void testPhoneSaveService() {
        Manufacturer manufacturer = new Manufacturer();
        PhoneInput phone = new PhoneInput("testMName","testBattery", "testResolution", "testDisplaySize", "testDisplayType", "testImgSource", "testSelfieCamera", "testMainCamera", "testName", "testWeight", 2010, "testSound", "testTechonlogy", "testOs");
        assertNull(phoneService.save(phone));
    }

    @Test
    public void testPhoneDeleteService() {
        Manufacturer manufacturer = new Manufacturer();
        Phone phone = new Phone(null,manufacturer,"testBattery", "testResolution", "testDisplaySize", "testDisplayType", "testImgSource", "testSelfieCamera", "testMainCamera", "testName", "testWeight", 2010, "testSound", "testTechonlogy", "testOs");
        assertNotNull(phoneService.delete(phone.getId()));
    }

}

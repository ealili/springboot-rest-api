package mrtech.springbootrestapi;


import mrtech.springbootrestapi.pojo.Manufacturer;
import mrtech.springbootrestapi.service.manufacturer.ManufacturerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DefaultManufacturerServiceTests {
    @Autowired
    private ManufacturerService manufacturerService;

    @Test
    void testManufacturerFindAllService() {
        assertNotNull(manufacturerService.findAll());
    }

    @Test
    void testManufacturerSaveService() {
        Manufacturer manufacturer = new Manufacturer("Samsung", "Seoul, South Korea");
        Manufacturer manufacturer1 = new Manufacturer("TestMname", "TestHeadQuarters");

        assertNull(manufacturerService.save(manufacturer));
        //after you run manufacturer1 for the first time, the second time the test will fail since it exists in database
        assertNotNull(manufacturerService.save(manufacturer1));
    }


    @Test
    void testManufacturerDeleteService() {
        String mname = "Samsung";
        String mnameTest = "Test";

        //after you run mname for the first time, the second time the test will fail since it doesn't exists in database
        assertTrue(manufacturerService.delete(mname));
        assertFalse(manufacturerService.delete(mnameTest));
    }
}